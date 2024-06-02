package yamsroun.jooqfirstlook.film;

import org.jooq.*;
import org.jooq.generated.tables.*;
import org.jooq.generated.tables.daos.FilmDao;
import org.jooq.generated.tables.pojos.Film;
import org.springframework.stereotype.Repository;
import yamsroun.jooqfirstlook.config.converter.PriceCategoryConverter;

import java.math.BigDecimal;
import java.util.List;

import static org.jooq.impl.DSL.*;
import static yamsroun.jooqfirstlook.utils.JooqConditionUtils.containsValue;

@Repository
public class FilmRepositoryHasA {

    private static final JFilm FILM = JFilm.FILM;

    private final FilmDao dao;
    private final DSLContext dslContext;

    public FilmRepositoryHasA(Configuration configuration, DSLContext dslContext) {
        this.dao = new FilmDao(configuration);
        this.dslContext = dslContext;
    }

    public Film findById(long id) {
        return dao.fetchOneByJFilmId(id);
    }

    public List<Film> findByRangeBetween(int from, int to) {
        return dao.fetchRangeOfJLength(from, to);
    }

    public List<FilmPriceSummary> findFilmPriceSummaryByFilmTitle(String filmTitle) {
        JInventory INVENTORY = JInventory.INVENTORY;
        return dslContext.select(
                FILM.FILM_ID,
                FILM.TITLE,
                FILM.RENTAL_RATE,
                case_()
                    .when(FILM.RENTAL_RATE.lessOrEqual(BigDecimal.valueOf(1.0)), "Cheap")
                    .when(FILM.RENTAL_RATE.lessOrEqual(BigDecimal.valueOf(3.0)), "Moderate")
                    .else_("Expensive")
                    .as("price_category").convert(new PriceCategoryConverter()),
                selectCount()
                    .from(INVENTORY)
                    .where(INVENTORY.FILM_ID.eq(FILM.FILM_ID))
                    .asField("total_inventory"))
            .from(FILM)
            .where(containsValue(FILM.TITLE, filmTitle))
            .fetchInto(FilmPriceSummary.class);
    }/**/

    public List<FilmRentalSummary> findFilmRentalSummaryByFilmTitleLike(String filmTitle) {
        JInventory INVENTORY = JInventory.INVENTORY;
        JRental RENTAL = JRental.RENTAL;

        String avgRentalDurationColumn = "avg_rental_duration";

        var rentalDurationView = select(
            INVENTORY.FILM_ID,
            avg(localDateTimeDiff(DatePart.DAY, RENTAL.RENTAL_DATE, RENTAL.RETURN_DATE))
                .as(avgRentalDurationColumn))
            .from(RENTAL)
            .join(INVENTORY).on(INVENTORY.INVENTORY_ID.eq(RENTAL.INVENTORY_ID))
            .where(RENTAL.RETURN_DATE.isNotNull())
            .groupBy(INVENTORY.FILM_ID)
            .asTable("RENTAL_DURATION");

        return dslContext.select(
                FILM.FILM_ID,
                FILM.TITLE,
                rentalDurationView.field(avgRentalDurationColumn))
            .from(FILM)
            .join(rentalDurationView).on(rentalDurationView.field(INVENTORY.FILM_ID).eq(FILM.FILM_ID))
            .where(containsValue(FILM.TITLE, filmTitle))
            .orderBy(field(name(avgRentalDurationColumn)).desc())
            .fetchInto(FilmRentalSummary.class);
    }

    public List<Film> findRentedFilmByTitle(String filmTitle) {
        JInventory INVENTORY = JInventory.INVENTORY;
        JRental RENTAL = JRental.RENTAL;

        return dslContext.selectFrom(FILM)
            .whereExists(selectOne()
                .from(INVENTORY)
                .join(RENTAL).on(RENTAL.INVENTORY_ID.eq(INVENTORY.INVENTORY_ID))
                .where(INVENTORY.FILM_ID.eq(FILM.FILM_ID)))
            .and(containsValue(FILM.TITLE, filmTitle))
            .fetchInto(Film.class);
    }
}

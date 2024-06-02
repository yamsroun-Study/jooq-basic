package yamsroun.jooqfirstlook.film;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.generated.tables.JFilm;
import org.jooq.generated.tables.daos.FilmDao;
import org.jooq.generated.tables.pojos.Film;
import org.springframework.stereotype.Repository;

@Repository
public class FilmRepositoryIsA extends FilmDao {

    private static final JFilm FILM = JFilm.FILM;

    private final DSLContext dsl;

    public FilmRepositoryIsA(Configuration configuration, DSLContext dsl) {
        super(configuration);
        this.dsl = dsl;
    }

    public Film findById(long id) {
        return super.findById(id);
    }
}

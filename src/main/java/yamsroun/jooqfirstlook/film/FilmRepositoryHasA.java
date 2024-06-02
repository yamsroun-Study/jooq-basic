package yamsroun.jooqfirstlook.film;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.generated.tables.JFilm;
import org.jooq.generated.tables.daos.FilmDao;
import org.jooq.generated.tables.pojos.Film;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepositoryHasA {

    private static final JFilm FILM = JFilm.FILM;

    private final FilmDao dao;
    private final DSLContext dsl;

    public FilmRepositoryHasA(Configuration configuration, DSLContext dsl) {
        this.dao = new FilmDao(configuration);
        this.dsl = dsl;
    }

    public Film findById(long id) {
        return dao.fetchOneByJFilmId(id);
    }

    public List<Film> findByRangeBetween(int from, int to) {
        return dao.fetchRangeOfJLength(from, to);
    }
}

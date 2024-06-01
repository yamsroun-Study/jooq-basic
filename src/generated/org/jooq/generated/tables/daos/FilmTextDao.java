/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.FilmText;
import org.jooq.generated.tables.records.FilmTextRecord;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmTextDao extends DAOImpl<FilmTextRecord, org.jooq.generated.tables.pojos.FilmText, Integer> {

    /**
     * Create a new FilmTextDao without any configuration
     */
    public FilmTextDao() {
        super(FilmText.FILM_TEXT, org.jooq.generated.tables.pojos.FilmText.class);
    }

    /**
     * Create a new FilmTextDao with an attached configuration
     */
    public FilmTextDao(Configuration configuration) {
        super(FilmText.FILM_TEXT, org.jooq.generated.tables.pojos.FilmText.class, configuration);
    }

    @Override
    public Integer getId(org.jooq.generated.tables.pojos.FilmText object) {
        return object.getFilmId();
    }

    /**
     * Fetch records that have <code>film_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.FilmText> fetchRangeOfFilmId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(FilmText.FILM_TEXT.FILM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>film_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.FilmText> fetchByFilmId(Integer... values) {
        return fetch(FilmText.FILM_TEXT.FILM_ID, values);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public org.jooq.generated.tables.pojos.FilmText fetchOneByFilmId(Integer value) {
        return fetchOne(FilmText.FILM_TEXT.FILM_ID, value);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public Optional<org.jooq.generated.tables.pojos.FilmText> fetchOptionalByFilmId(Integer value) {
        return fetchOptional(FilmText.FILM_TEXT.FILM_ID, value);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.FilmText> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(FilmText.FILM_TEXT.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.FilmText> fetchByTitle(String... values) {
        return fetch(FilmText.FILM_TEXT.TITLE, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.FilmText> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(FilmText.FILM_TEXT.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.FilmText> fetchByDescription(String... values) {
        return fetch(FilmText.FILM_TEXT.DESCRIPTION, values);
    }
}

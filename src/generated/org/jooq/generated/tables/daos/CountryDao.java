/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.JCountry;
import org.jooq.generated.tables.pojos.Country;
import org.jooq.generated.tables.records.CountryRecord;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CountryDao extends DAOImpl<CountryRecord, Country, UInteger> {

    /**
     * Create a new CountryDao without any configuration
     */
    public CountryDao() {
        super(JCountry.COUNTRY, Country.class);
    }

    /**
     * Create a new CountryDao with an attached configuration
     */
    public CountryDao(Configuration configuration) {
        super(JCountry.COUNTRY, Country.class, configuration);
    }

    @Override
    public UInteger getId(Country object) {
        return object.getCountryId();
    }

    /**
     * Fetch records that have <code>country_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Country> fetchRangeOfJCountryId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(JCountry.COUNTRY.COUNTRY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>country_id IN (values)</code>
     */
    public List<Country> fetchByJCountryId(UInteger... values) {
        return fetch(JCountry.COUNTRY.COUNTRY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>country_id = value</code>
     */
    public Country fetchOneByJCountryId(UInteger value) {
        return fetchOne(JCountry.COUNTRY.COUNTRY_ID, value);
    }

    /**
     * Fetch a unique record that has <code>country_id = value</code>
     */
    public Optional<Country> fetchOptionalByJCountryId(UInteger value) {
        return fetchOptional(JCountry.COUNTRY.COUNTRY_ID, value);
    }

    /**
     * Fetch records that have <code>country BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Country> fetchRangeOfJCountry(String lowerInclusive, String upperInclusive) {
        return fetchRange(JCountry.COUNTRY.COUNTRY_, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>country IN (values)</code>
     */
    public List<Country> fetchByJCountry(String... values) {
        return fetch(JCountry.COUNTRY.COUNTRY_, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Country> fetchRangeOfJLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JCountry.COUNTRY.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<Country> fetchByJLastUpdate(LocalDateTime... values) {
        return fetch(JCountry.COUNTRY.LAST_UPDATE, values);
    }
}

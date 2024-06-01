/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.City;
import org.jooq.generated.tables.records.CityRecord;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CityDao extends DAOImpl<CityRecord, org.jooq.generated.tables.pojos.City, UInteger> {

    /**
     * Create a new CityDao without any configuration
     */
    public CityDao() {
        super(City.CITY, org.jooq.generated.tables.pojos.City.class);
    }

    /**
     * Create a new CityDao with an attached configuration
     */
    public CityDao(Configuration configuration) {
        super(City.CITY, org.jooq.generated.tables.pojos.City.class, configuration);
    }

    @Override
    public UInteger getId(org.jooq.generated.tables.pojos.City object) {
        return object.getCityId();
    }

    /**
     * Fetch records that have <code>city_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchRangeOfCityId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(City.CITY.CITY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>city_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchByCityId(UInteger... values) {
        return fetch(City.CITY.CITY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>city_id = value</code>
     */
    public org.jooq.generated.tables.pojos.City fetchOneByCityId(UInteger value) {
        return fetchOne(City.CITY.CITY_ID, value);
    }

    /**
     * Fetch a unique record that has <code>city_id = value</code>
     */
    public Optional<org.jooq.generated.tables.pojos.City> fetchOptionalByCityId(UInteger value) {
        return fetchOptional(City.CITY.CITY_ID, value);
    }

    /**
     * Fetch records that have <code>city BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchRangeOfCity(String lowerInclusive, String upperInclusive) {
        return fetchRange(City.CITY.CITY_, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchByCity(String... values) {
        return fetch(City.CITY.CITY_, values);
    }

    /**
     * Fetch records that have <code>country_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchRangeOfCountryId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(City.CITY.COUNTRY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>country_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchByCountryId(UInteger... values) {
        return fetch(City.CITY.COUNTRY_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(City.CITY.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.City> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(City.CITY.LAST_UPDATE, values);
    }
}

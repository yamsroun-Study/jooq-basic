/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.JCustomer;
import org.jooq.generated.tables.pojos.Customer;
import org.jooq.generated.tables.records.CustomerRecord;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CustomerDao extends DAOImpl<CustomerRecord, Customer, Long> {

    /**
     * Create a new CustomerDao without any configuration
     */
    public CustomerDao() {
        super(JCustomer.CUSTOMER, Customer.class);
    }

    /**
     * Create a new CustomerDao with an attached configuration
     */
    public CustomerDao(Configuration configuration) {
        super(JCustomer.CUSTOMER, Customer.class, configuration);
    }

    @Override
    public Long getId(Customer object) {
        return object.getCustomerId();
    }

    /**
     * Fetch records that have <code>customer_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJCustomerId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.CUSTOMER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<Customer> fetchByJCustomerId(Long... values) {
        return fetch(JCustomer.CUSTOMER.CUSTOMER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>customer_id = value</code>
     */
    public Customer fetchOneByJCustomerId(Long value) {
        return fetchOne(JCustomer.CUSTOMER.CUSTOMER_ID, value);
    }

    /**
     * Fetch a unique record that has <code>customer_id = value</code>
     */
    public Optional<Customer> fetchOptionalByJCustomerId(Long value) {
        return fetchOptional(JCustomer.CUSTOMER.CUSTOMER_ID, value);
    }

    /**
     * Fetch records that have <code>store_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJStoreId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.STORE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>store_id IN (values)</code>
     */
    public List<Customer> fetchByJStoreId(Long... values) {
        return fetch(JCustomer.CUSTOMER.STORE_ID, values);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<Customer> fetchByJFirstName(String... values) {
        return fetch(JCustomer.CUSTOMER.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<Customer> fetchByJLastName(String... values) {
        return fetch(JCustomer.CUSTOMER.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<Customer> fetchByJEmail(String... values) {
        return fetch(JCustomer.CUSTOMER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>address_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJAddressId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.ADDRESS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address_id IN (values)</code>
     */
    public List<Customer> fetchByJAddressId(Long... values) {
        return fetch(JCustomer.CUSTOMER.ADDRESS_ID, values);
    }

    /**
     * Fetch records that have <code>active BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJActive(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.ACTIVE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<Customer> fetchByJActive(Byte... values) {
        return fetch(JCustomer.CUSTOMER.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>create_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJCreateDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.CREATE_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<Customer> fetchByJCreateDate(LocalDateTime... values) {
        return fetch(JCustomer.CUSTOMER.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Customer> fetchRangeOfJLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JCustomer.CUSTOMER.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<Customer> fetchByJLastUpdate(LocalDateTime... values) {
        return fetch(JCustomer.CUSTOMER.LAST_UPDATE, values);
    }
}

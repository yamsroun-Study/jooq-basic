/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.Payment;
import org.jooq.generated.tables.records.PaymentRecord;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PaymentDao extends DAOImpl<PaymentRecord, org.jooq.generated.tables.pojos.Payment, UInteger> {

    /**
     * Create a new PaymentDao without any configuration
     */
    public PaymentDao() {
        super(Payment.PAYMENT, org.jooq.generated.tables.pojos.Payment.class);
    }

    /**
     * Create a new PaymentDao with an attached configuration
     */
    public PaymentDao(Configuration configuration) {
        super(Payment.PAYMENT, org.jooq.generated.tables.pojos.Payment.class, configuration);
    }

    @Override
    public UInteger getId(org.jooq.generated.tables.pojos.Payment object) {
        return object.getPaymentId();
    }

    /**
     * Fetch records that have <code>payment_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchRangeOfPaymentId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(Payment.PAYMENT.PAYMENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>payment_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchByPaymentId(UInteger... values) {
        return fetch(Payment.PAYMENT.PAYMENT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>payment_id = value</code>
     */
    public org.jooq.generated.tables.pojos.Payment fetchOneByPaymentId(UInteger value) {
        return fetchOne(Payment.PAYMENT.PAYMENT_ID, value);
    }

    /**
     * Fetch a unique record that has <code>payment_id = value</code>
     */
    public Optional<org.jooq.generated.tables.pojos.Payment> fetchOptionalByPaymentId(UInteger value) {
        return fetchOptional(Payment.PAYMENT.PAYMENT_ID, value);
    }

    /**
     * Fetch records that have <code>customer_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchRangeOfCustomerId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(Payment.PAYMENT.CUSTOMER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchByCustomerId(UInteger... values) {
        return fetch(Payment.PAYMENT.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>staff_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchRangeOfStaffId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(Payment.PAYMENT.STAFF_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>staff_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchByStaffId(UInteger... values) {
        return fetch(Payment.PAYMENT.STAFF_ID, values);
    }

    /**
     * Fetch records that have <code>rental_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchRangeOfRentalId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Payment.PAYMENT.RENTAL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchByRentalId(Integer... values) {
        return fetch(Payment.PAYMENT.RENTAL_ID, values);
    }

    /**
     * Fetch records that have <code>amount BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchRangeOfAmount(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Payment.PAYMENT.AMOUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchByAmount(BigDecimal... values) {
        return fetch(Payment.PAYMENT.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>payment_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchRangeOfPaymentDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Payment.PAYMENT.PAYMENT_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>payment_date IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchByPaymentDate(LocalDateTime... values) {
        return fetch(Payment.PAYMENT.PAYMENT_DATE, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Payment.PAYMENT.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Payment> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Payment.PAYMENT.LAST_UPDATE, values);
    }
}
/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import org.jooq.generated.tables.JCustomerList;
import org.jooq.generated.tables.pojos.CustomerList;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CustomerListRecord extends TableRecordImpl<CustomerListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.customer_list.ID</code>.
     */
    public CustomerListRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.customer_list.name</code>.
     */
    public CustomerListRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.customer_list.address</code>.
     */
    public CustomerListRecord setAddress(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.customer_list.zip code</code>.
     */
    public CustomerListRecord setZipCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.zip code</code>.
     */
    public String getZipCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.customer_list.phone</code>.
     */
    public CustomerListRecord setPhone(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.phone</code>.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.customer_list.city</code>.
     */
    public CustomerListRecord setCity(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.city</code>.
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sakila.customer_list.country</code>.
     */
    public CustomerListRecord setCountry(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.country</code>.
     */
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sakila.customer_list.notes</code>.
     */
    public CustomerListRecord setNotes(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.notes</code>.
     */
    public String getNotes() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sakila.customer_list.SID</code>.
     */
    public CustomerListRecord setSid(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer_list.SID</code>.
     */
    public Long getSid() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerListRecord
     */
    public CustomerListRecord() {
        super(JCustomerList.CUSTOMER_LIST);
    }

    /**
     * Create a detached, initialised CustomerListRecord
     */
    public CustomerListRecord(Long id, String name, String address, String zipCode, String phone, String city, String country, String notes, Long sid) {
        super(JCustomerList.CUSTOMER_LIST);

        setId(id);
        setName(name);
        setAddress(address);
        setZipCode(zipCode);
        setPhone(phone);
        setCity(city);
        setCountry(country);
        setNotes(notes);
        setSid(sid);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CustomerListRecord
     */
    public CustomerListRecord(CustomerList value) {
        super(JCustomerList.CUSTOMER_LIST);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAddress(value.getAddress());
            setZipCode(value.getZipCode());
            setPhone(value.getPhone());
            setCity(value.getCity());
            setCountry(value.getCountry());
            setNotes(value.getNotes());
            setSid(value.getSid());
            resetChangedOnNotNull();
        }
    }
}

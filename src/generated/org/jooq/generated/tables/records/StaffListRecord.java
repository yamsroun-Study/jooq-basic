/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import org.jooq.generated.tables.JStaffList;
import org.jooq.generated.tables.pojos.StaffList;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StaffListRecord extends TableRecordImpl<StaffListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.staff_list.ID</code>.
     */
    public StaffListRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.staff_list.name</code>.
     */
    public StaffListRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.staff_list.address</code>.
     */
    public StaffListRecord setAddress(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.staff_list.zip code</code>.
     */
    public StaffListRecord setZipCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.zip code</code>.
     */
    public String getZipCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.staff_list.phone</code>.
     */
    public StaffListRecord setPhone(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.phone</code>.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.staff_list.city</code>.
     */
    public StaffListRecord setCity(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.city</code>.
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sakila.staff_list.country</code>.
     */
    public StaffListRecord setCountry(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.country</code>.
     */
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sakila.staff_list.SID</code>.
     */
    public StaffListRecord setSid(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.SID</code>.
     */
    public Long getSid() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaffListRecord
     */
    public StaffListRecord() {
        super(JStaffList.STAFF_LIST);
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    public StaffListRecord(Long id, String name, String address, String zipCode, String phone, String city, String country, Long sid) {
        super(JStaffList.STAFF_LIST);

        setId(id);
        setName(name);
        setAddress(address);
        setZipCode(zipCode);
        setPhone(phone);
        setCity(city);
        setCountry(country);
        setSid(sid);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    public StaffListRecord(StaffList value) {
        super(JStaffList.STAFF_LIST);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAddress(value.getAddress());
            setZipCode(value.getZipCode());
            setPhone(value.getPhone());
            setCity(value.getCity());
            setCountry(value.getCountry());
            setSid(value.getSid());
            resetChangedOnNotNull();
        }
    }
}

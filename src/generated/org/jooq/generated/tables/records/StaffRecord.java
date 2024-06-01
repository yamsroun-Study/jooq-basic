/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.Staff;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StaffRecord extends UpdatableRecordImpl<StaffRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.staff.staff_id</code>.
     */
    public StaffRecord setStaffId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.staff_id</code>.
     */
    public UInteger getStaffId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>sakila.staff.first_name</code>.
     */
    public StaffRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.staff.last_name</code>.
     */
    public StaffRecord setLastName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.staff.address_id</code>.
     */
    public StaffRecord setAddressId(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.address_id</code>.
     */
    public UInteger getAddressId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>sakila.staff.picture</code>.
     */
    public StaffRecord setPicture(byte[] value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.picture</code>.
     */
    public byte[] getPicture() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>sakila.staff.email</code>.
     */
    public StaffRecord setEmail(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sakila.staff.store_id</code>.
     */
    public StaffRecord setStoreId(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.store_id</code>.
     */
    public UInteger getStoreId() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>sakila.staff.active</code>.
     */
    public StaffRecord setActive(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sakila.staff.username</code>.
     */
    public StaffRecord setUsername(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.username</code>.
     */
    public String getUsername() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sakila.staff.password</code>.
     */
    public StaffRecord setPassword(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.password</code>.
     */
    public String getPassword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sakila.staff.last_update</code>.
     */
    public StaffRecord setLastUpdate(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaffRecord
     */
    public StaffRecord() {
        super(Staff.STAFF);
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    public StaffRecord(UInteger staffId, String firstName, String lastName, UInteger addressId, byte[] picture, String email, UInteger storeId, Byte active, String username, String password, LocalDateTime lastUpdate) {
        super(Staff.STAFF);

        setStaffId(staffId);
        setFirstName(firstName);
        setLastName(lastName);
        setAddressId(addressId);
        setPicture(picture);
        setEmail(email);
        setStoreId(storeId);
        setActive(active);
        setUsername(username);
        setPassword(password);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    public StaffRecord(org.jooq.generated.tables.pojos.Staff value) {
        super(Staff.STAFF);

        if (value != null) {
            setStaffId(value.getStaffId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setAddressId(value.getAddressId());
            setPicture(value.getPicture());
            setEmail(value.getEmail());
            setStoreId(value.getStoreId());
            setActive(value.getActive());
            setUsername(value.getUsername());
            setPassword(value.getPassword());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}

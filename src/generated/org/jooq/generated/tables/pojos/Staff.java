/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long staffId;
    private String firstName;
    private String lastName;
    private Long addressId;
    private byte[] picture;
    private String email;
    private Long storeId;
    private Byte active;
    private String username;
    private String password;
    private LocalDateTime lastUpdate;

    public Staff() {}

    public Staff(Staff value) {
        this.staffId = value.staffId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.addressId = value.addressId;
        this.picture = value.picture;
        this.email = value.email;
        this.storeId = value.storeId;
        this.active = value.active;
        this.username = value.username;
        this.password = value.password;
        this.lastUpdate = value.lastUpdate;
    }

    public Staff(
        Long staffId,
        String firstName,
        String lastName,
        Long addressId,
        byte[] picture,
        String email,
        Long storeId,
        Byte active,
        String username,
        String password,
        LocalDateTime lastUpdate
    ) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressId = addressId;
        this.picture = picture;
        this.email = email;
        this.storeId = storeId;
        this.active = active;
        this.username = username;
        this.password = password;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.staff.staff_id</code>.
     */
    public Long getStaffId() {
        return this.staffId;
    }

    /**
     * Setter for <code>sakila.staff.staff_id</code>.
     */
    public Staff setStaffId(Long staffId) {
        this.staffId = staffId;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>sakila.staff.first_name</code>.
     */
    public Staff setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>sakila.staff.last_name</code>.
     */
    public Staff setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.address_id</code>.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>sakila.staff.address_id</code>.
     */
    public Staff setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.picture</code>.
     */
    public byte[] getPicture() {
        return this.picture;
    }

    /**
     * Setter for <code>sakila.staff.picture</code>.
     */
    public Staff setPicture(byte[] picture) {
        this.picture = picture;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>sakila.staff.email</code>.
     */
    public Staff setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.store_id</code>.
     */
    public Long getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>sakila.staff.store_id</code>.
     */
    public Staff setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.active</code>.
     */
    public Byte getActive() {
        return this.active;
    }

    /**
     * Setter for <code>sakila.staff.active</code>.
     */
    public Staff setActive(Byte active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>sakila.staff.username</code>.
     */
    public Staff setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>sakila.staff.password</code>.
     */
    public Staff setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.staff.last_update</code>.
     */
    public Staff setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Staff other = (Staff) obj;
        if (this.staffId == null) {
            if (other.staffId != null)
                return false;
        }
        else if (!this.staffId.equals(other.staffId))
            return false;
        if (this.firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!this.firstName.equals(other.firstName))
            return false;
        if (this.lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!this.lastName.equals(other.lastName))
            return false;
        if (this.addressId == null) {
            if (other.addressId != null)
                return false;
        }
        else if (!this.addressId.equals(other.addressId))
            return false;
        if (this.picture == null) {
            if (other.picture != null)
                return false;
        }
        else if (!Arrays.equals(this.picture, other.picture))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.storeId == null) {
            if (other.storeId != null)
                return false;
        }
        else if (!this.storeId.equals(other.storeId))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.username == null) {
            if (other.username != null)
                return false;
        }
        else if (!this.username.equals(other.username))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        if (this.lastUpdate == null) {
            if (other.lastUpdate != null)
                return false;
        }
        else if (!this.lastUpdate.equals(other.lastUpdate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.staffId == null) ? 0 : this.staffId.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.addressId == null) ? 0 : this.addressId.hashCode());
        result = prime * result + ((this.picture == null) ? 0 : Arrays.hashCode(this.picture));
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.storeId == null) ? 0 : this.storeId.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.username == null) ? 0 : this.username.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Staff (");

        sb.append(staffId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(addressId);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(email);
        sb.append(", ").append(storeId);
        sb.append(", ").append(active);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger paymentId;
    private UInteger customerId;
    private UInteger staffId;
    private Integer rentalId;
    private BigDecimal amount;
    private LocalDateTime paymentDate;
    private LocalDateTime lastUpdate;

    public Payment() {}

    public Payment(Payment value) {
        this.paymentId = value.paymentId;
        this.customerId = value.customerId;
        this.staffId = value.staffId;
        this.rentalId = value.rentalId;
        this.amount = value.amount;
        this.paymentDate = value.paymentDate;
        this.lastUpdate = value.lastUpdate;
    }

    public Payment(
        UInteger paymentId,
        UInteger customerId,
        UInteger staffId,
        Integer rentalId,
        BigDecimal amount,
        LocalDateTime paymentDate,
        LocalDateTime lastUpdate
    ) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.staffId = staffId;
        this.rentalId = rentalId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.payment.payment_id</code>.
     */
    public UInteger getPaymentId() {
        return this.paymentId;
    }

    /**
     * Setter for <code>sakila.payment.payment_id</code>.
     */
    public Payment setPaymentId(UInteger paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Getter for <code>sakila.payment.customer_id</code>.
     */
    public UInteger getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>sakila.payment.customer_id</code>.
     */
    public Payment setCustomerId(UInteger customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>sakila.payment.staff_id</code>.
     */
    public UInteger getStaffId() {
        return this.staffId;
    }

    /**
     * Setter for <code>sakila.payment.staff_id</code>.
     */
    public Payment setStaffId(UInteger staffId) {
        this.staffId = staffId;
        return this;
    }

    /**
     * Getter for <code>sakila.payment.rental_id</code>.
     */
    public Integer getRentalId() {
        return this.rentalId;
    }

    /**
     * Setter for <code>sakila.payment.rental_id</code>.
     */
    public Payment setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
        return this;
    }

    /**
     * Getter for <code>sakila.payment.amount</code>.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>sakila.payment.amount</code>.
     */
    public Payment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>sakila.payment.payment_date</code>.
     */
    public LocalDateTime getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Setter for <code>sakila.payment.payment_date</code>.
     */
    public Payment setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Getter for <code>sakila.payment.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.payment.last_update</code>.
     */
    public Payment setLastUpdate(LocalDateTime lastUpdate) {
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
        final Payment other = (Payment) obj;
        if (this.paymentId == null) {
            if (other.paymentId != null)
                return false;
        }
        else if (!this.paymentId.equals(other.paymentId))
            return false;
        if (this.customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!this.customerId.equals(other.customerId))
            return false;
        if (this.staffId == null) {
            if (other.staffId != null)
                return false;
        }
        else if (!this.staffId.equals(other.staffId))
            return false;
        if (this.rentalId == null) {
            if (other.rentalId != null)
                return false;
        }
        else if (!this.rentalId.equals(other.rentalId))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
            return false;
        if (this.paymentDate == null) {
            if (other.paymentDate != null)
                return false;
        }
        else if (!this.paymentDate.equals(other.paymentDate))
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
        result = prime * result + ((this.paymentId == null) ? 0 : this.paymentId.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.staffId == null) ? 0 : this.staffId.hashCode());
        result = prime * result + ((this.rentalId == null) ? 0 : this.rentalId.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.paymentDate == null) ? 0 : this.paymentDate.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Payment (");

        sb.append(paymentId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(staffId);
        sb.append(", ").append(rentalId);
        sb.append(", ").append(amount);
        sb.append(", ").append(paymentDate);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.Indexes;
import org.jooq.generated.JSakila;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.JCustomer.CustomerPath;
import org.jooq.generated.tables.JInventory.InventoryPath;
import org.jooq.generated.tables.JPayment.PaymentPath;
import org.jooq.generated.tables.JStaff.StaffPath;
import org.jooq.generated.tables.records.RentalRecord;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JRental extends TableImpl<RentalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.rental</code>
     */
    public static final JRental RENTAL = new JRental();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RentalRecord> getRecordType() {
        return RentalRecord.class;
    }

    /**
     * The column <code>sakila.rental.rental_id</code>.
     */
    public final TableField<RentalRecord, Integer> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.rental.rental_date</code>.
     */
    public final TableField<RentalRecord, LocalDateTime> RENTAL_DATE = createField(DSL.name("rental_date"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>sakila.rental.inventory_id</code>.
     */
    public final TableField<RentalRecord, Long> INVENTORY_ID = createField(DSL.name("inventory_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.rental.customer_id</code>.
     */
    public final TableField<RentalRecord, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.rental.return_date</code>.
     */
    public final TableField<RentalRecord, LocalDateTime> RETURN_DATE = createField(DSL.name("return_date"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>sakila.rental.staff_id</code>.
     */
    public final TableField<RentalRecord, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.rental.last_update</code>.
     */
    public final TableField<RentalRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private JRental(Name alias, Table<RentalRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JRental(Name alias, Table<RentalRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>sakila.rental</code> table reference
     */
    public JRental(String alias) {
        this(DSL.name(alias), RENTAL);
    }

    /**
     * Create an aliased <code>sakila.rental</code> table reference
     */
    public JRental(Name alias) {
        this(alias, RENTAL);
    }

    /**
     * Create a <code>sakila.rental</code> table reference
     */
    public JRental() {
        this(DSL.name("rental"), null);
    }

    public <O extends Record> JRental(Table<O> path, ForeignKey<O, RentalRecord> childPath, InverseForeignKey<O, RentalRecord> parentPath) {
        super(path, childPath, parentPath, RENTAL);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class RentalPath extends JRental implements Path<RentalRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> RentalPath(Table<O> path, ForeignKey<O, RentalRecord> childPath, InverseForeignKey<O, RentalRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private RentalPath(Name alias, Table<RentalRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public RentalPath as(String alias) {
            return new RentalPath(DSL.name(alias), this);
        }

        @Override
        public RentalPath as(Name alias) {
            return new RentalPath(alias, this);
        }

        @Override
        public RentalPath as(Table<?> alias) {
            return new RentalPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.RENTAL_IDX_FK_CUSTOMER_ID, Indexes.RENTAL_IDX_FK_INVENTORY_ID, Indexes.RENTAL_IDX_FK_STAFF_ID);
    }

    @Override
    public Identity<RentalRecord, Integer> getIdentity() {
        return (Identity<RentalRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<RentalRecord> getPrimaryKey() {
        return Keys.KEY_RENTAL_PRIMARY;
    }

    @Override
    public List<UniqueKey<RentalRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_RENTAL_RENTAL_DATE);
    }

    @Override
    public List<ForeignKey<RentalRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_RENTAL_INVENTORY, Keys.FK_RENTAL_CUSTOMER, Keys.FK_RENTAL_STAFF);
    }

    private transient InventoryPath _inventory;

    /**
     * Get the implicit join path to the <code>sakila.inventory</code> table.
     */
    public InventoryPath inventory() {
        if (_inventory == null)
            _inventory = new InventoryPath(this, Keys.FK_RENTAL_INVENTORY, null);

        return _inventory;
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit join path to the <code>sakila.customer</code> table.
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, Keys.FK_RENTAL_CUSTOMER, null);

        return _customer;
    }

    private transient StaffPath _staff;

    /**
     * Get the implicit join path to the <code>sakila.staff</code> table.
     */
    public StaffPath staff() {
        if (_staff == null)
            _staff = new StaffPath(this, Keys.FK_RENTAL_STAFF, null);

        return _staff;
    }

    private transient PaymentPath _payment;

    /**
     * Get the implicit to-many join path to the <code>sakila.payment</code>
     * table
     */
    public PaymentPath payment() {
        if (_payment == null)
            _payment = new PaymentPath(this, null, Keys.FK_PAYMENT_RENTAL.getInverseKey());

        return _payment;
    }

    @Override
    public JRental as(String alias) {
        return new JRental(DSL.name(alias), this);
    }

    @Override
    public JRental as(Name alias) {
        return new JRental(alias, this);
    }

    @Override
    public JRental as(Table<?> alias) {
        return new JRental(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JRental rename(String name) {
        return new JRental(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JRental rename(Name name) {
        return new JRental(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JRental rename(Table<?> name) {
        return new JRental(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JRental where(Condition condition) {
        return new JRental(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JRental where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JRental where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JRental where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JRental where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JRental where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JRental where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JRental where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JRental whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JRental whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}

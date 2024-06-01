/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.math.BigDecimal;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.JSakila;
import org.jooq.generated.tables.records.SalesByFilmCategoryRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JSalesByFilmCategory extends TableImpl<SalesByFilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.sales_by_film_category</code>
     */
    public static final JSalesByFilmCategory SALES_BY_FILM_CATEGORY = new JSalesByFilmCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesByFilmCategoryRecord> getRecordType() {
        return SalesByFilmCategoryRecord.class;
    }

    /**
     * The column <code>sakila.sales_by_film_category.category</code>.
     */
    public final TableField<SalesByFilmCategoryRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>sakila.sales_by_film_category.total_sales</code>.
     */
    public final TableField<SalesByFilmCategoryRecord, BigDecimal> TOTAL_SALES = createField(DSL.name("total_sales"), SQLDataType.DECIMAL(27, 2), this, "");

    private JSalesByFilmCategory(Name alias, Table<SalesByFilmCategoryRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JSalesByFilmCategory(Name alias, Table<SalesByFilmCategoryRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `sales_by_film_category` as select `c`.`name` AS `category`,sum(`p`.`amount`) AS `total_sales` from (((((`sakila`.`payment` `p` join `sakila`.`rental` `r` on((`p`.`rental_id` = `r`.`rental_id`))) join `sakila`.`inventory` `i` on((`r`.`inventory_id` = `i`.`inventory_id`))) join `sakila`.`film` `f` on((`i`.`film_id` = `f`.`film_id`))) join `sakila`.`film_category` `fc` on((`f`.`film_id` = `fc`.`film_id`))) join `sakila`.`category` `c` on((`fc`.`category_id` = `c`.`category_id`))) group by `c`.`name` order by `total_sales` desc"), where);
    }

    /**
     * Create an aliased <code>sakila.sales_by_film_category</code> table
     * reference
     */
    public JSalesByFilmCategory(String alias) {
        this(DSL.name(alias), SALES_BY_FILM_CATEGORY);
    }

    /**
     * Create an aliased <code>sakila.sales_by_film_category</code> table
     * reference
     */
    public JSalesByFilmCategory(Name alias) {
        this(alias, SALES_BY_FILM_CATEGORY);
    }

    /**
     * Create a <code>sakila.sales_by_film_category</code> table reference
     */
    public JSalesByFilmCategory() {
        this(DSL.name("sales_by_film_category"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSakila.SAKILA;
    }

    @Override
    public JSalesByFilmCategory as(String alias) {
        return new JSalesByFilmCategory(DSL.name(alias), this);
    }

    @Override
    public JSalesByFilmCategory as(Name alias) {
        return new JSalesByFilmCategory(alias, this);
    }

    @Override
    public JSalesByFilmCategory as(Table<?> alias) {
        return new JSalesByFilmCategory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JSalesByFilmCategory rename(String name) {
        return new JSalesByFilmCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JSalesByFilmCategory rename(Name name) {
        return new JSalesByFilmCategory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JSalesByFilmCategory rename(Table<?> name) {
        return new JSalesByFilmCategory(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSalesByFilmCategory where(Condition condition) {
        return new JSalesByFilmCategory(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSalesByFilmCategory where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSalesByFilmCategory where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSalesByFilmCategory where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSalesByFilmCategory where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSalesByFilmCategory where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSalesByFilmCategory where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSalesByFilmCategory where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSalesByFilmCategory whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSalesByFilmCategory whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
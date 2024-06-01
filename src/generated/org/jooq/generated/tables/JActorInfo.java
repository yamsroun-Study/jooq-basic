/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


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
import org.jooq.generated.tables.records.ActorInfoRecord;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JActorInfo extends TableImpl<ActorInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.actor_info</code>
     */
    public static final JActorInfo ACTOR_INFO = new JActorInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorInfoRecord> getRecordType() {
        return ActorInfoRecord.class;
    }

    /**
     * The column <code>sakila.actor_info.actor_id</code>.
     */
    public final TableField<ActorInfoRecord, Long> ACTOR_ID = createField(DSL.name("actor_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.actor_info.first_name</code>.
     */
    public final TableField<ActorInfoRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor_info.last_name</code>.
     */
    public final TableField<ActorInfoRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor_info.film_info</code>.
     */
    public final TableField<ActorInfoRecord, String> FILM_INFO = createField(DSL.name("film_info"), SQLDataType.CLOB, this, "");

    private JActorInfo(Name alias, Table<ActorInfoRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JActorInfo(Name alias, Table<ActorInfoRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `actor_info` as select `a`.`actor_id` AS `actor_id`,`a`.`first_name` AS `first_name`,`a`.`last_name` AS `last_name`,group_concat(distinct concat(`c`.`name`,': ',(select group_concat(`f`.`title` order by `f`.`title` ASC separator ', ') from ((`sakila`.`film` `f` join `sakila`.`film_category` `fc` on((`f`.`film_id` = `fc`.`film_id`))) join `sakila`.`film_actor` `fa` on((`f`.`film_id` = `fa`.`film_id`))) where ((`fc`.`category_id` = `c`.`category_id`) and (`fa`.`actor_id` = `a`.`actor_id`)))) order by `c`.`name` ASC separator '; ') AS `film_info` from (((`sakila`.`actor` `a` left join `sakila`.`film_actor` `fa` on((`a`.`actor_id` = `fa`.`actor_id`))) left join `sakila`.`film_category` `fc` on((`fa`.`film_id` = `fc`.`film_id`))) left join `sakila`.`category` `c` on((`fc`.`category_id` = `c`.`category_id`))) group by `a`.`actor_id`,`a`.`first_name`,`a`.`last_name`"), where);
    }

    /**
     * Create an aliased <code>sakila.actor_info</code> table reference
     */
    public JActorInfo(String alias) {
        this(DSL.name(alias), ACTOR_INFO);
    }

    /**
     * Create an aliased <code>sakila.actor_info</code> table reference
     */
    public JActorInfo(Name alias) {
        this(alias, ACTOR_INFO);
    }

    /**
     * Create a <code>sakila.actor_info</code> table reference
     */
    public JActorInfo() {
        this(DSL.name("actor_info"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSakila.SAKILA;
    }

    @Override
    public JActorInfo as(String alias) {
        return new JActorInfo(DSL.name(alias), this);
    }

    @Override
    public JActorInfo as(Name alias) {
        return new JActorInfo(alias, this);
    }

    @Override
    public JActorInfo as(Table<?> alias) {
        return new JActorInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JActorInfo rename(String name) {
        return new JActorInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JActorInfo rename(Name name) {
        return new JActorInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JActorInfo rename(Table<?> name) {
        return new JActorInfo(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JActorInfo where(Condition condition) {
        return new JActorInfo(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JActorInfo where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JActorInfo where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JActorInfo where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JActorInfo where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JActorInfo where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JActorInfo where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JActorInfo where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JActorInfo whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JActorInfo whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}

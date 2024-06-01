/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.generated.JSakila;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JInventoryHeldByCustomer extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>sakila.inventory_held_by_customer.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>sakila.inventory_held_by_customer.p_inventory_id</code>.
     */
    public static final Parameter<Integer> P_INVENTORY_ID = Internal.createParameter("p_inventory_id", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public JInventoryHeldByCustomer() {
        super("inventory_held_by_customer", JSakila.SAKILA, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_INVENTORY_ID);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter IN value to the routine
     */
    public void setPInventoryId(Integer value) {
        setValue(P_INVENTORY_ID, value);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public JInventoryHeldByCustomer setPInventoryId(Field<Integer> field) {
        setField(P_INVENTORY_ID, field);
        return this;
    }
}
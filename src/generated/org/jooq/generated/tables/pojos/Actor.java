/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Actor implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger actorId;
    private String firstName;
    private String lastName;
    private LocalDateTime lastUpdate;

    public Actor() {}

    public Actor(Actor value) {
        this.actorId = value.actorId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.lastUpdate = value.lastUpdate;
    }

    public Actor(
        UInteger actorId,
        String firstName,
        String lastName,
        LocalDateTime lastUpdate
    ) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.actor.actor_id</code>.
     */
    public UInteger getActorId() {
        return this.actorId;
    }

    /**
     * Setter for <code>sakila.actor.actor_id</code>.
     */
    public Actor setActorId(UInteger actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * Getter for <code>sakila.actor.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>sakila.actor.first_name</code>.
     */
    public Actor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Getter for <code>sakila.actor.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>sakila.actor.last_name</code>.
     */
    public Actor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Getter for <code>sakila.actor.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.actor.last_update</code>.
     */
    public Actor setLastUpdate(LocalDateTime lastUpdate) {
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
        final Actor other = (Actor) obj;
        if (this.actorId == null) {
            if (other.actorId != null)
                return false;
        }
        else if (!this.actorId.equals(other.actorId))
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
        result = prime * result + ((this.actorId == null) ? 0 : this.actorId.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Actor (");

        sb.append(actorId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record2;
import org.jooq.generated.tables.FilmActor;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmActorRecord extends UpdatableRecordImpl<FilmActorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.film_actor.actor_id</code>.
     */
    public FilmActorRecord setActorId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.actor_id</code>.
     */
    public UInteger getActorId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>sakila.film_actor.film_id</code>.
     */
    public FilmActorRecord setFilmId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.film_id</code>.
     */
    public UInteger getFilmId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>sakila.film_actor.last_update</code>.
     */
    public FilmActorRecord setLastUpdate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UInteger, UInteger> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmActorRecord
     */
    public FilmActorRecord() {
        super(FilmActor.FILM_ACTOR);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(UInteger actorId, UInteger filmId, LocalDateTime lastUpdate) {
        super(FilmActor.FILM_ACTOR);

        setActorId(actorId);
        setFilmId(filmId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(org.jooq.generated.tables.pojos.FilmActor value) {
        super(FilmActor.FILM_ACTOR);

        if (value != null) {
            setActorId(value.getActorId());
            setFilmId(value.getFilmId());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmText implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer filmId;
    private String title;
    private String description;

    public FilmText() {}

    public FilmText(FilmText value) {
        this.filmId = value.filmId;
        this.title = value.title;
        this.description = value.description;
    }

    public FilmText(
        Integer filmId,
        String title,
        String description
    ) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
    }

    /**
     * Getter for <code>sakila.film_text.film_id</code>.
     */
    public Integer getFilmId() {
        return this.filmId;
    }

    /**
     * Setter for <code>sakila.film_text.film_id</code>.
     */
    public FilmText setFilmId(Integer filmId) {
        this.filmId = filmId;
        return this;
    }

    /**
     * Getter for <code>sakila.film_text.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>sakila.film_text.title</code>.
     */
    public FilmText setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>sakila.film_text.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>sakila.film_text.description</code>.
     */
    public FilmText setDescription(String description) {
        this.description = description;
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
        final FilmText other = (FilmText) obj;
        if (this.filmId == null) {
            if (other.filmId != null)
                return false;
        }
        else if (!this.filmId.equals(other.filmId))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.filmId == null) ? 0 : this.filmId.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FilmText (");

        sb.append(filmId);
        sb.append(", ").append(title);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}

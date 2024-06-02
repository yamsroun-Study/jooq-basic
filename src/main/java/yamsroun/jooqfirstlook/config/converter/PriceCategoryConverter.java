package yamsroun.jooqfirstlook.config.converter;

import org.jooq.impl.EnumConverter;
import yamsroun.jooqfirstlook.film.FilmPriceSummary;

public class PriceCategoryConverter extends EnumConverter<String, FilmPriceSummary.PriceCategory> {

    public PriceCategoryConverter() {
        super(String.class, FilmPriceSummary.PriceCategory.class, FilmPriceSummary.PriceCategory::getCode);
    }
}

package yamsroun.jooqfirstlook.film;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FilmPriceSummary {

    private final long filmId;
    private final String title;
    private final double rentalRate;
    private final String priceCategory;
    private final long totalInventory;
}

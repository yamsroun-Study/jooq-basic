package yamsroun.jooqfirstlook.film;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FilmPriceSummary {

    private final long filmId;
    private final String title;
    private final double rentalRate;
    private final PriceCategory priceCategory;
    private final long totalInventory;

    @Getter
    @RequiredArgsConstructor
    public enum PriceCategory {
        CHEAP("Cheap"),
        MODERATE("Moderate"),
        EXPENSIVE("Expensive");

        private final String code;

        public static PriceCategory findByCode(String code) {
            for (PriceCategory value: values()) {
                if (value.getCode().equalsIgnoreCase(code)) {
                    return value;
                }
            }
            return null;
        }
    }
}

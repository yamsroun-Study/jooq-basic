package yamsroun.jooqfirstlook.film;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class FilmRentalSummary {

    private final Long filmId;
    private final String title;
    private final BigDecimal averageRentalDuration;
}

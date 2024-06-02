package yamsroun.jooqfirstlook.actor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.pojos.Film;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ActorFilmography {

    private final Actor actor;
    private final List<Film> films;
}

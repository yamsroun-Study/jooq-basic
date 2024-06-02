package yamsroun.jooqfirstlook.actor;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class ActorFilmographyCondition {

    private final String actorName;
    private final String filmTitle;
}

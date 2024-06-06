package yamsroun.jooqfirstlook.actor;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class ActorUpdateRequest {

    private String firstName;
    private String lastName;
}

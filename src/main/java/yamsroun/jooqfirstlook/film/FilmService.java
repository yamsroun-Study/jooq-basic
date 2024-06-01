package yamsroun.jooqfirstlook.film;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yamsroun.jooqfirstlook.web.FilmWithActorPagedResponse;
import yamsroun.jooqfirstlook.web.PagedResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmRepository repository;

    public FilmWithActorPagedResponse getFilmActorPageResponse(int page, int pageSize) {
        List<FilmWithActor> list = repository.findFilmWithActorList(page, pageSize);
        PagedResponse pagedResponse = new PagedResponse(page, pageSize);
        return new FilmWithActorPagedResponse(list, pagedResponse);
    }
}

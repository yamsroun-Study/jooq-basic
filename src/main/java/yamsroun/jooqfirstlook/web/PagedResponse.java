package yamsroun.jooqfirstlook.web;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PagedResponse {

    private long page;
    private long pageSize;
}

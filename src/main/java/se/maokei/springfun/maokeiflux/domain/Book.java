package se.maokei.springfun.maokeiflux.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Document
 * MongoDB entity
 * */
@org.springframework.data.mongodb.core.mapping.Document
@Data
@NoArgsConstructor
public class Book {
    private String id;
    @NonNull
    private String title;

}

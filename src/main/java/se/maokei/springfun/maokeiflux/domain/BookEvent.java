package se.maokei.springfun.maokeiflux.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class BookEvent {
    private String BookId;
    private Date date;
}

package hr.dstr89.hexagonal.domain.data;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private UUID id;
    private String title;
    private String author;
    private String description;

}

package hr.dstr89.hexagonal.domain.repo;

import hr.dstr89.hexagonal.domain.data.Book;

import java.util.UUID;

public interface BooksRepository {

    void save(Book book);

    void delete(UUID id);

}

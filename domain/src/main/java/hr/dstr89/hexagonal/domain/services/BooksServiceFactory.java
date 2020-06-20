package hr.dstr89.hexagonal.domain.services;

import hr.dstr89.hexagonal.domain.repo.BooksRepository;

public class BooksServiceFactory {

    public static BooksService getBooksService(BooksRepository booksRepository) {
        return new BooksServiceImpl(booksRepository);
    }

}

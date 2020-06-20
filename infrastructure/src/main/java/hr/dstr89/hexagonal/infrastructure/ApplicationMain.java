package hr.dstr89.hexagonal.infrastructure;

import hr.dstr89.hexagonal.application.ConsoleApp;
import hr.dstr89.hexagonal.domain.services.BooksService;
import hr.dstr89.hexagonal.domain.services.BooksServiceFactory;
import hr.dstr89.hexagonal.infrastructure.repo.BooksRepositoryImpl;

public class ApplicationMain {

    public static void main(String[] args) {
        BooksService booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), booksService);
        consoleApp.waitForCommand();
    }

}

package me.doorur.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    BookService bookService(BookRepository bookRepository) {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository);

        return bookService;
    }
}

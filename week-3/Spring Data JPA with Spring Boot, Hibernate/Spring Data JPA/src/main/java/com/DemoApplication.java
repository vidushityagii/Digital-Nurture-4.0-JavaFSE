package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // INSERT
        Book b1 = new Book("Java Basics", "John Doe");
        Book b2 = new Book("Spring Boot", "Jane Smith");
        bookRepository.save(b1);
        bookRepository.save(b2);

        // SELECT
        System.out.println("All Books:");
        bookRepository.findAll().forEach(System.out::println);

        // UPDATE
        b1.setAuthor("Updated Author");
        bookRepository.save(b1);

        // DELETE
        bookRepository.deleteById(b2.getId());
    }
}


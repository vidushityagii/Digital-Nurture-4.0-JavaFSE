package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        System.out.println("Book List:");
        bookRepository.getAllBooks().forEach(System.out::println);
    }
}

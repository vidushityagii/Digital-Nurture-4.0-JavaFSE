package com.example.service;

import com.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        bookRepository.getAllBooks().forEach(System.out::println);
    }
}


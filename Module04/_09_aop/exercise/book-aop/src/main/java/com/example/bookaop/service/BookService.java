package com.example.bookaop.service;

import com.example.bookaop.models.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    void save(Book book);
    void delete(int id);
}

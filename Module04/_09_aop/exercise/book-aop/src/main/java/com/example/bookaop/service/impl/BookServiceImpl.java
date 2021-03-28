package com.example.bookaop.service.impl;

import com.example.bookaop.models.Book;
import com.example.bookaop.repositories.BookRepository;
import com.example.bookaop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return this.bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public void delete(int id) {
        this.bookRepository.deleteById(id);
    }
}

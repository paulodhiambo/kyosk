package com.kyosk.kyosk.service.impl;

import com.kyosk.kyosk.domain.BookEntity;
import com.kyosk.kyosk.repository.BookRepository;
import com.kyosk.kyosk.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(BookEntity book) {
        return bookRepository.save(book);
    }

    @Override
    public BookEntity getBookById(String id) {
        return bookRepository.findById(id).orElseThrow(() -> new IllegalStateException("Book with id " + id + " not found"));
    }

    @Override
    public BookEntity updateBook(String id, BookEntity book) {
        if (bookRepository.existsById(id)) {
            return bookRepository.save(book);
        } else {
            throw new IllegalStateException("Book with id " + id + " not found");
        }
    }

    @Override
    public void deleteBookById(String id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        } else {
            throw new IllegalStateException("Book with id " + id + " not found");
        }
    }

    @Override
    public Page<BookEntity> listBooks(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return bookRepository.findAll(pageable);
    }
}

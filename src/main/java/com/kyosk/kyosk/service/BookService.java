package com.kyosk.kyosk.service;

import com.kyosk.kyosk.domain.BookEntity;
import org.springframework.data.domain.Page;

public interface BookService {
    BookEntity createBook(BookEntity book);

    BookEntity getBookById(String id);

    BookEntity updateBook(String id, BookEntity book);

    void deleteBookById(String id);

    Page<BookEntity> listBooks(int page, int size);
}

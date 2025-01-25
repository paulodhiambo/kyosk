package com.kyosk.kyosk.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class BookEntity {
    @Id
    private String id;
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private Integer publicationYear;
    private Double price;
    private String isbn;
    private Integer stock;
}

package com.tutorial.elasticsearchspringboot.service;

import com.tutorial.elasticsearchspringboot.model.Book;
import com.tutorial.elasticsearchspringboot.repository.BookRepository;
import java.util.Collections;
import java.util.List;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public Book saveBook(Book book) {
    return bookRepository.save(book);
  }

  public List<Book> findByTitle(String title) {
    return bookRepository.findByTitle(title);
  }

  public List<Book> findByAuthor(String author) {
    return bookRepository.findByAuthor(author);
  }

  public Iterable<Book> findAllBooks() {
    return bookRepository.findAll();
  }
}

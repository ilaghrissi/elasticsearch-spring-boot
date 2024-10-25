package com.tutorial.elasticsearchspringboot.controller;

import com.tutorial.elasticsearchspringboot.model.Book;
import com.tutorial.elasticsearchspringboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

  @Autowired
  private BookService bookService;

  @PostMapping
  public Book addBook(@RequestBody Book book) {
    return bookService.saveBook(book);
  }

  @GetMapping("/title/{title}")
  public List<Book> getBooksByTitle(@PathVariable String title) {
    return bookService.findByTitle(title);
  }

  @GetMapping("/author/{author}")
  public List<Book> getBooksByAuthor(@PathVariable String author) {
    return bookService.findByAuthor(author);
  }

  @GetMapping
  public Iterable<Book> getAllBooks() {
    return bookService.findAllBooks();
  }
}


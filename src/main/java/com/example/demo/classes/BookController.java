package com.example.demo.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {

  private final BookService bookService;

  @Autowired
  BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public List<Book> getBooks() {
    return bookService.getBooks();
  }
}

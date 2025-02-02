package com.example.demo.classes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
  public List<Book> getBooks() {
    return List.of(
      new Book(1L, "Danil", "Novokhatskiy", "Dendi","1234", "56789")
    );
  }
}

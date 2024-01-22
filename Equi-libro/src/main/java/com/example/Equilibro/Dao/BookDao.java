package com.example.Equilibro.Dao;

import com.example.Equilibro.Model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookDao extends CrudRepository<Book, Integer> {
    Book findById(Long id);
    Iterable<Book> findAll();


    List<Book> findBookByTitle(String title);
}

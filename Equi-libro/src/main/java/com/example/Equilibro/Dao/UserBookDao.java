package com.example.Equilibro.Dao;

import com.example.Equilibro.Model.User_Book;
import org.springframework.data.repository.CrudRepository;


public interface UserBookDao extends CrudRepository<User_Book, Long> {
}
package com.example.Equilibro.Dao;

import com.example.Equilibro.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Integer> {
    List<User> findByName(String name);
    User findById(int id);
    @Query("SELECT u FROM User u WHERE u.userName = :username AND u.password = :password")
    User login(String username, String password);
}
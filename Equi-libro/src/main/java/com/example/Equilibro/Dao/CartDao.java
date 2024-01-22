package com.example.Equilibro.Dao;

import com.example.Equilibro.Model.Cart;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CartDao extends CrudRepository<Cart, Integer> {
    Cart findById(Long id);

}

package com.example.Equilibro.Controller;

import com.example.Equilibro.Dao.BookDao;
import com.example.Equilibro.Dao.UserBookDao;
import com.example.Equilibro.Dao.UserDao;
import com.example.Equilibro.Model.Book;
import com.example.Equilibro.Model.User;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserDao userRepository ;



    @GetMapping("/home")
    public String homePage() {
        return "Home";
    }


    @GetMapping(value = "/Registration.html")
    public String registerUser(User user) {
        return "Registration";
    }

    @GetMapping(value = "/Login.html")
    public String loginUser(User user) {
        return "Login";
    }


    @PostMapping(value = "/registeruser")
    public String postUser(@Valid User user, BindingResult bindingResult , HttpSession session) {
        if (bindingResult.hasErrors())
            return "Registration";
        session.setAttribute("logged", user);
        userRepository.save(user);
        return "redirect:/Book/";
    }

    @PostMapping("/authUser")
    public String authUsertoBook(@RequestParam("userName") String username, @RequestParam("password") String password, HttpSession session) {
        User user = userRepository.login(username, password);
        if (user == null) {
            return "Login";
        } else {
            session.setAttribute("logged", user);
        }
        return "redirect:/Book/";
    }
@GetMapping("/logout")
    public String logout (HttpSession session){
        if(session!=null){
                session.invalidate();
        }
        return "redirect:/home";
}



}
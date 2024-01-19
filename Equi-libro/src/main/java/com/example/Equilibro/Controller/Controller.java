package com.example.Equilibro.Controller;

import com.example.Equilibro.Dao.BookDao;
import com.example.Equilibro.Dao.UserBookDao;
import com.example.Equilibro.Dao.UserDao;
import com.example.Equilibro.Model.Book;
import com.example.Equilibro.Model.User;
import com.example.Equilibro.Model.User_Book;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
    @Autowired
    private UserDao userRepository ;
    @Autowired
    private BookDao bookReposiory ;
    @Autowired

    private UserBookDao userBookRepository ;
    List<User> userArray = new ArrayList<>() ;
    List<Book> bookArray = new ArrayList<>() ;


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
    public String postUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "Registration";
        userRepository.save(user);
        return "redirect:/Book";
    }

    @PostMapping("/authUser")
    public String authUsertoBook(@RequestParam("userName") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        User user = userRepository.login(username , password);

        if ( user == null){
            return "Login";
        }else {
            session.setAttribute("logged " , user);
        }
        return "redirect:/Book";
    }




    @GetMapping(value = "/Book")
    public String sendtoBook(Model model, Book book) {
        //bookArray = bookReposiory.showBook();
        Iterable<Book> tempbooks = bookReposiory.findAll();
        model.addAttribute("books" ,bookReposiory.findAll());
        model.addAttribute("userbokk" , userBookRepository.findAll());
        return "Book";
    }


    @GetMapping(value="/AddBook.html")
    public String goToAddBook(Book book) {
        return "AddBook";
    }
    //   User user = (User) session.getAttribute("logged");

    @PostMapping("/addNewBook")
    public String addNewBook(@Valid Book book, BindingResult bindingResult, HttpSession session) {

        if (bindingResult.hasErrors()) {
            return "AddBook";
        }

        User u = new User("Prova", "Cognome", "username", "password");
        userRepository.save(u);
        Set<User> usrSet = new HashSet<>();
        usrSet.add(u);
        bookReposiory.save(book);
        User_Book userBook = new User_Book(u , book);
        userBookRepository.save(userBook);

        return "redirect:/Book";
    }

    @GetMapping("/details/{title}")
    @ResponseBody
    public String details (@PathVariable(value = "title") String title  ,Model model){
        List<Book> book = bookReposiory.findBookByTitle(title);
        model.addAttribute("libro" , book.get(0));
        return "details";
    }






}
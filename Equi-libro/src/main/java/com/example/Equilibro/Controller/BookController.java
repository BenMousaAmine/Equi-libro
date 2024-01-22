package com.example.Equilibro.Controller;

import com.example.Equilibro.Dao.BookDao;
import com.example.Equilibro.Dao.CartDao;
import com.example.Equilibro.Dao.UserBookDao;
import com.example.Equilibro.Dao.UserDao;
import com.example.Equilibro.Model.Book;
import com.example.Equilibro.Model.Cart;
import com.example.Equilibro.Model.User;
import com.example.Equilibro.Model.User_Book;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/Book")
public class BookController {
    @Autowired
    private BookDao bookReposiory ;
    @Autowired
    private UserDao userRepository ;
    @Autowired
    private UserBookDao userBookRepository ;
    @Autowired
    private CartDao cartRepository ;
    List<Cart> listCart  = new ArrayList<>() ;
    @GetMapping(value = "/")
    public String sendtoBook(Model model, HttpSession session) {
        if (session.getAttribute("logged") == null) {
            return "redirect:/home";
        }
        model.addAttribute("books", bookReposiory.findAll());
        model.addAttribute("userbokk", userBookRepository.findAll());
        return "Book";
    }
    @GetMapping(value="/AddBook.html")
    public String goToAddBook(Book book) {
        return "AddBook";
    }
    @PostMapping("/addNewBook")
    public String addNewBook(@Valid Book book, BindingResult bindingResult, HttpSession session) {

        if (bindingResult.hasErrors()) {
            return "AddBook";
        }

        User u ;
        if ( session.getAttribute("logged") == null){
            u = new User("Prova", "Cognome", "username", "password");
            userRepository.save(u);
            Set<User> usrSet = new HashSet<>();
            usrSet.add(u);
        }else
        {
            u = (User) session.getAttribute("logged");
        }
        bookReposiory.save(book);
        User_Book userBook = new User_Book(u , book);
        userBookRepository.save(userBook);

        return "redirect:/Book/";
    }

    @GetMapping("/cart/{id}")
    public String addToCart (@PathVariable(value = "id") Long id  , Model model ,HttpSession session){
        Book book = bookReposiory.findById(id);
        User user =(User) session.getAttribute("logged");

        Cart cart = new Cart(user , book , new Date());
        cartRepository.save(cart);
        listCart.add(cart);
        model.addAttribute("carts" , listCart);
        return "Cart";
    }

    @RequestMapping("/cart/remove/{id}")
    public String removeFromCart(@PathVariable(value = "id") Long id, Model model, HttpSession session) {
        Cart cart = cartRepository.findById(id);
        if (cart != null) {
            cartRepository.delete(cart);
            Iterator<Cart> iterator = listCart.iterator();
            while (iterator.hasNext()) {
                Cart c = iterator.next();
                if (c.getId() == id) {
                    iterator.remove();
                    break;
                }
            }
        }
        model.addAttribute("carts", listCart);

        return "redirect:/Book/";
    }


}


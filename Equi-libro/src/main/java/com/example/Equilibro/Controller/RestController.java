package com.example.Equilibro.Controller;

import com.example.Equilibro.Controller.GoogleBookApi.BookVolume;
import com.example.Equilibro.Controller.GoogleBookApi.Item;
import com.example.Equilibro.Dao.BookDao;
import com.example.Equilibro.Dao.UserBookDao;
import com.example.Equilibro.Dao.UserDao;
import com.example.Equilibro.Model.Book;
import com.example.Equilibro.Model.User;
import com.example.Equilibro.Model.User_Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;




import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;


    @RequestMapping("/json")
    @org.springframework.web.bind.annotation.RestController
    public class RestController {
        @Autowired
        private BookDao bookRepository ;
        @Autowired
        private UserDao userRepository ;
        @Autowired
        private UserBookDao userBookRepository ;

        String url = "https://www.googleapis.com/books/v1/volumes?q=harrypotter";
        RestTemplate restTemplate = new RestTemplate();

        @GetMapping("/allBook")
        public String allBook(){
            return bookRepository.findAll().toString();
        }


        @GetMapping("/book/{title}")
        public String bookWithTitle (@PathVariable String title){
            return bookRepository.findBookByTitle(title).toString();
        }

        @GetMapping("/fetch")
        public String fetchData() {
            try {
                User u = new User("Prova", "Cognome", "username", "password");
                userRepository.save(u);
                Set<User> usrSet = new HashSet<>();
                usrSet.add(u);
                BookVolume bookVolume = new BookVolume();
                bookVolume = restTemplate.getForObject(url, BookVolume.class) ;
                bookVolume.getItems() ;
                for (Item item : bookVolume.getItems()) {

                    String title = item.getVolumeInfo().getTitle();
                    String author = (item.getVolumeInfo().getAuthors() != null && !item.getVolumeInfo().getAuthors().isEmpty()) ?
                            item.getVolumeInfo().getAuthors().get(0) : "null";

                    Integer price = 50 ;
                    Integer year = 2005 ;//Integer.valueOf(item.getVolumeInfo().getPublishedDate()) ;
                    String home  = item.getVolumeInfo().getMaturityRating() ;
                    Long id = 5L;
                    Book book = new Book( id,title ,author , home ,year , price );
                    bookRepository.save(book);
                    userRepository.save(u);
                    User_Book userBook = new User_Book(u , book);
                    userBookRepository.save(userBook);
                    id++ ;
                }


                return "Save Success";

            } catch (RestClientException e) {
                return "Error occurred while fetching data from the API";
            }
        }




    }







package com.Spring.Start.Lessons_2_MVC.Controller;

import com.Spring.Start.Lessons_2_MVC.Repo.BookRepository;
import com.Spring.Start.Lessons_2_MVC.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@org.springframework.stereotype.Controller
public class Controller {
   private BookRepository bookRepository;
    @Autowired
    public Controller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        model.addAttribute("newbook",new Book());
        return "home";
    }
    @PostMapping
    public String createBook(Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }
}

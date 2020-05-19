package com.progect.Strong.Starter.lessons_3_and_4_Rest_Servise.Controller;

import com.progect.Strong.Starter.lessons_3_and_4_Rest_Servise.Repo.BookRepository;
import com.progect.Strong.Starter.lessons_3_and_4_Rest_Servise.model.Book;
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

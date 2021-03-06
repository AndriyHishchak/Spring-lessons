package com.Spring.Start.Lessons_11_Validation.Controller;

import com.Spring.Start.Lessons_11_Validation.Repo.BookRepository;
import com.Spring.Start.Lessons_11_Validation.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@org.springframework.stereotype.Controller
public class Controller {
   private BookRepository bookRepository;
    @Autowired
    public Controller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String getIndex( Model model) {
        model.addAttribute("books", bookRepository.findAll());
        model.addAttribute("newbook",new Book());
        return "home_11";
    }
    @PostMapping
    public String createBook(Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }
    @GetMapping("/{id}/show")
    public String showbook(@PathVariable("id") Long id,

                           Model model) {
        if(bookRepository.findById(id).isPresent()){
            model.addAttribute("book",bookRepository.findById(id).get());
            return "show_11";
        }
        model.addAttribute("book",new Book());
        return "show_11";
    }

    @GetMapping("/{id}/delete")
    public String deletebook(@PathVariable("id") Long id){
        bookRepository.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("{id}/edit")
    public String editgetbook(@PathVariable("id") Long id,

                           Model model) {
        if(bookRepository.findById(id).isPresent()){
            model.addAttribute("book",bookRepository.findById(id).get());
            return "edit_11";
        }
        model.addAttribute("book",new Book());
        return "edit_11";
    }
    @PostMapping("/{id}")
    public String Editbook(@Valid Book book,
                           Errors errors){
        if(errors.hasErrors()) {
            return "edit_11";
        }
        bookRepository.save(book);
        return "redirect:/";
    }
}

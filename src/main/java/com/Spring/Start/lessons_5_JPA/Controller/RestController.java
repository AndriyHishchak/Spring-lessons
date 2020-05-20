package com.Spring.Start.lessons_5_JPA.Controller;

import com.Spring.Start.lessons_5_JPA.Repo.BookRepository;
import com.Spring.Start.lessons_5_JPA.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = {"/api"},produces = "application/json") //будемо выддавати json
public class RestController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/all")
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll() ;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book> getbyIdBook(
            @PathVariable("id") Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) {
            return new ResponseEntity<>(book.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping(consumes = "application/json")
    public Book saveBook (
            @RequestBody Book book) {
     return bookRepository.save(book);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete_books(@PathVariable("id") Long id){
         try {
             bookRepository.deleteById(id);
         }catch (EmptyResultDataAccessException e){}
    }
    @PutMapping("/{id}")
    public Book putBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
    @PatchMapping(path = "/{id}",consumes = "application/json")
    public Book patchBook(@PathVariable("id")Long id,
                          @RequestBody Book bookPath) {
        Book bookRefresh = bookRepository.findById(id).get();
        if(bookPath.getAuthor() !=null){
            bookRefresh.setAuthor(bookPath.getAuthor());
        }
        if(bookPath.getName() != null) {
            bookRefresh.setName(bookPath.getName());
        }
        return bookRepository.save(bookRefresh);
    }


}

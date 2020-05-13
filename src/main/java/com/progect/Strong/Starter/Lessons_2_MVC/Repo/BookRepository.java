package com.progect.Strong.Starter.Lessons_2_MVC.Repo;


import com.progect.Strong.Starter.Lessons_2_MVC.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}

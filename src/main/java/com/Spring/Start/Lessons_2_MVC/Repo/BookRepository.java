package com.Spring.Start.Lessons_2_MVC.Repo;


import com.Spring.Start.Lessons_2_MVC.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}

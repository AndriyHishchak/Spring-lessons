package com.Spring.Start.lessons_15_Mail.Repo;


import com.Spring.Start.lessons_15_Mail.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}

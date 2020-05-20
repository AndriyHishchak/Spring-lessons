package com.Spring.Start.lessons_7_CRUD_HTML_Show_Delete_Edit.Repo;


import com.Spring.Start.lessons_7_CRUD_HTML_Show_Delete_Edit.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}

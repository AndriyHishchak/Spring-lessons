package com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.Repo;


import com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}

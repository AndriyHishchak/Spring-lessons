package com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.Repo;

import com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImegeRepo extends CrudRepository <Image,Long> {
}

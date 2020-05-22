package com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@ControllerAdvice
public class fileUploadExceptionAdvice {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String handleMaxsizeExcepting(Model model) {
        model.addAttribute("message","File too large for us! (Maximum 5 MB)");
        return "image";
    }
}

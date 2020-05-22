package com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice;

import com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.model.Image;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class INFO {
    //TODO:     *********************************************************
    //TODO:     * Мета: * Зробити загруску в databases files and imeges *
    //TODO:     *********************************************************
    //TODO:     @Lob - жирна анотація
    //TODO:     @ControllerAdvice - це контролер Исключениэ. В ньому указують
    //                 методи-исключения які,будуть якось реагувати на ошибку.
    //TODO:     -------------------------------------------------------
    //TODO:     1)  Створити Packages model
    //TODO:         Створити Images в model (private Byte[] images)
    //TODO:       ----------------------------------------------------
    //TODO:     2)  Створити Packages Repo
    //TODO:         Створити RepoImages в Repo
    //TODO:       ----------------------------------------------------
    //TODO:     3)  Створити Packages Controller
    //TODO:         Створити ImageController в Controller
    //TODO:
    //TODO:         1. First екшин - виводить UI
    //TODO:              @GetMapping
    //TODO:           public String getFrmToLoadImage(Model model) {
    //TODO:        model.addAttribute("message", "Maximum 5MB");
    //TODO:        return "image";
    //TODO:           }
    //TODO:         -----      ------        ------      -------       -----
    //TODO:         2. First екшин - обробляэ форму відправки файла в database
    //TODO:
    //TODO:     @PostMapping
    //TODO:     public String loadImage(@RequestParam("description")String description,
    //TODO:                             @RequestParam("file") MultipartFile file) throws IOException {
    //TODO:         Byte[] bArray = new Byte[file.getBytes().length];
    //TODO:         int i = 0;
    //TODO:         for(byte b : file.getBytes()) bArray[i++] = b;
    //TODO:
    //TODO:         imegeRepo.save(new Image(description,bArray));
    //TODO:
    //TODO:          return "redirect:/image";
    //TODO:     }
    //TODO:             -----      ------        ------      -------       -----
    //TODO:     3. First екшин - по id images в databases дістаємо із databases images і вертаємо її
    //TODO:
    //TODO:     @GetMapping("/{id}")
    //TODO:     public void renderImage(@PathVariable("id")String id,
    //TODO:                        HttpServletResponse response) throws IOException {
    //TODO:         response.setContentType("image/jpeg");
    //TODO:        Image image = imegeRepo.findById(Long.valueOf(id)).get();
    //TODO:         byte[] bArray = new byte[image.getImage().length];
    //TODO:        int i = 0;
    //TODO:       for(byte b : image.getImage()) bArray[i++] = b;
    //TODO:         try (InputStream is = new ByteArrayInputStream(bArray)) {
    //TODO:             IOUtils.copy(is, response.getOutputStream());
    //TODO:         }
    //TODO:     }
    //TODO:     ----------------------------------------------------------------------
    //TODO:     4)  Поставити межі на загруску File до 5 MB
    //TODO:         Вставляэмо в App.properties - [ spring.servlet.multipart.max-file-size=5MB ]
    //TODO:         Створюэмо ControllerAdvice - для оброблення ошибок
    //TODO:
    //TODO:              @ExceptionHandler(MaxUploadSizeExceededException.class)
    //TODO:         public String handleMaxsizeExceptin(Model model) {
    //TODO:             model.addAttribute("message","File too large for us! (Maximum 5 MB)");
    //TODO:             return "image";
    //TODO:         }
    //TODO:
    //TODO:       MaxUploadSizeExceededException - це исключения випливаэ, томущо ми в
    //TODO:       в App.properties - spring.servlet.multipart.max-file-size=5MB
    //TODO:     -------------------------------------------------------------------------------
    //TODO:
    //TODO:
    //TODO:
    //TODO:


}

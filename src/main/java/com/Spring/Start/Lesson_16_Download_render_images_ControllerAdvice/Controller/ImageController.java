package com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.Controller;

import com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.Repo.ImegeRepo;
import com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.model.Image;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/image")
public class ImageController {

    private ImegeRepo imegeRepo;

    @Autowired
    public ImageController(ImegeRepo imegeRepo) {
        this.imegeRepo = imegeRepo;
    }
    @GetMapping
    public String getFrmToLoadImage(Model model) {
        model.addAttribute("message", "Maximum 5MB");
        return "image";
    }
    @PostMapping
    public String loadImage(@RequestParam("description")String description,
                            @RequestParam("file")MultipartFile file) throws IOException {
        Byte[] bArray = new Byte[file.getBytes().length];
        int i = 0;
        for(byte b : file.getBytes()) bArray[i++] = b;

        imegeRepo.save(new Image(description,bArray));

        return "redirect:/image";
    }
    @GetMapping("/{id}")
    public void renderImage(@PathVariable("id")String id,
                            HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        Image image = imegeRepo.findById(Long.valueOf(id)).get();
        byte[] bArray = new byte[image.getImage().length];
        int i = 0;
        for(byte b : image.getImage()) bArray[i++] = b;
        try (InputStream is = new ByteArrayInputStream(bArray)) {
            IOUtils.copy(is, response.getOutputStream());
        }
    }
}

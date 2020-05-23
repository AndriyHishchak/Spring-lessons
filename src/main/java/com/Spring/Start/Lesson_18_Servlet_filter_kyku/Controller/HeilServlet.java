package com.Spring.Start.Lesson_18_Servlet_filter_kyku.Controller;


import com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.Repo.BookRepository;
import com.Spring.Start.lessons_15_Mail.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getRequestURI();




    }
}

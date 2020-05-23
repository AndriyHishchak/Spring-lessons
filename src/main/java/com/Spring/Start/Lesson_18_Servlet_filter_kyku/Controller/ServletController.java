package com.Spring.Start.Lesson_18_Servlet_filter_kyku.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ServletController {
    @GetMapping("/servlet")
    public String gethome(Model model) {
        model.addAttribute("message","ook, u can do it");
        return "servlet";
    }
    @GetMapping("/cookie")
    public String getCookie(HttpServletResponse response){
        response.addCookie(new Cookie("dima","dima"));
        return "cookie";
    }

}

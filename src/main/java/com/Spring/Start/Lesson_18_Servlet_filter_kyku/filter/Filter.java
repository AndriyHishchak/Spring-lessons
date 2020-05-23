package com.Spring.Start.Lesson_18_Servlet_filter_kyku.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Filter implements javax.servlet.Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        Cookie[] arrayCokies = request.getCookies();
        boolean checkit = false;

        if(arrayCokies == null) {
            response.sendRedirect("image");
        }

        for(Cookie cokie : arrayCokies){
            if(cokie.getName().equals("dima")) checkit = true;
        }
        //filterChain - я дозволяю ыти далы
        if(checkit) {
            filterChain.doFilter(request,response);
        }
        //якщо куки нема, робимо редірект
        else {
            response.sendRedirect("image");
        }
    }
}

package com.Spring.Start.Lesson_18_Servlet_filter_kyku.conf;

import com.Spring.Start.Lesson_18_Servlet_filter_kyku.filter.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class conf {

    @Bean
   public FilterRegistrationBean<Filter> filterFilterRegistrationBean () {
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new Filter());
        filterFilterRegistrationBean.addUrlPatterns("/home");
        return filterFilterRegistrationBean;
    }
}

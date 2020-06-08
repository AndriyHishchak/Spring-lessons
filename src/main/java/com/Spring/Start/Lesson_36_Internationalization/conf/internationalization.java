package com.Spring.Start.Lesson_36_Internationalization.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;


import java.util.Locale;

@Configuration
public class internationalization implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver() {
       CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
       cookieLocaleResolver.setDefaultLocale(new Locale("en"));
       cookieLocaleResolver.setCookieName("language");

       return cookieLocaleResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        return new LocaleChangeInterceptor();
    }
}

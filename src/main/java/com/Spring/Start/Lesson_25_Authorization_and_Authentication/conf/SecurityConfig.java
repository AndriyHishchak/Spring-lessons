package com.Spring.Start.Lesson_25_Authorization_and_Authentication.conf;

import com.Spring.Start.Lesson_25_Authorization_and_Authentication.Service.MyUserDetalis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;


    @Bean
    @Order(1)
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder(10);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers( "/registration","*/static/**","*/activate/*","/","/js/**","/fonts/**","/css/**","/images/**","/vendor/**").permitAll()// доступны сторінки усім ролям
                .anyRequest().authenticated() // усі інші не доступні
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .failureForwardUrl("/") // форма логіна по даному url та доступ на старнову сторніку
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/").permitAll(); // форма логаута по даному url та доступ на старнову сторніку
    }
}

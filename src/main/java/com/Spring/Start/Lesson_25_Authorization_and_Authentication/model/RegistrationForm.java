package com.Spring.Start.Lesson_25_Authorization_and_Authentication.model;


import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;

public class  RegistrationForm {

    private String username;
    private String password;
    private String email;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder){
        User user = new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));

        user.setPhone(phone);
        user.setUsername(username);
        user.setRoles(Collections.singleton(Role.USER));
        return user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

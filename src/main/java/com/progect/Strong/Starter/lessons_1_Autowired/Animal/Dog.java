package com.progect.Strong.Starter.lessons_1_Autowired.Animal;

import com.progect.Strong.Starter.lessons_1_Autowired.Service.AnimalSound;

public class Dog implements AnimalSound {
    @Override
    public String sound() {
        return "woow";
    }
}

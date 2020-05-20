package com.Spring.Start.lessons_1_Autowired.Animal;

import com.Spring.Start.lessons_1_Autowired.Service.AnimalSound;

public class Dog implements AnimalSound {
    @Override
    public String sound() {
        return "woow";
    }
}

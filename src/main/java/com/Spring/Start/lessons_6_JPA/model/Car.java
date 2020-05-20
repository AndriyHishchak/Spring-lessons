package com.Spring.Start.lessons_6_JPA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne
    private Owner owner;
    @Enumerated(EnumType.STRING)
    private CarType carType;

}

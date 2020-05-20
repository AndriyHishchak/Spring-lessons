package com.Spring.Start.lessons_6_JPA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Address address;

    @OneToMany(mappedBy = "owner")

    private List<Car> cars = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "Gym_Onner",
            joinColumns = @JoinColumn(name = "gym_id"),
            inverseJoinColumns = @JoinColumn(name = "ownner_id"))
    private List<Gym> gyms = new ArrayList<Gym>();
}

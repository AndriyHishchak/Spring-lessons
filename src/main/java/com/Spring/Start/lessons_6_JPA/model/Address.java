package com.Spring.Start.lessons_6_JPA.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String country;


}

package com.progect.Strong.Starter.lessons_6_JPA.model;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String country;


}

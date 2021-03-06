package com.Spring.Start.lessons_7_CRUD_HTML_Show_Delete_Edit.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "gyms")
    private List<Owner> owners = new ArrayList<Owner>();

}

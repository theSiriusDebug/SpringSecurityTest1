package com.example.movieService.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "developers")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String firstName;
    @Column
    private String surName;
    public Developer(long id, String firstName, String surName) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
    }
    public Developer(){}
}

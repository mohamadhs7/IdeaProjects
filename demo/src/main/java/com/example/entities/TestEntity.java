package com.example.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class TestEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String lastName;

    public TestEntity( String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public TestEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

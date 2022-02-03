package com.example.restfullstarting.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.springframework.boot.convert.DataSizeUnit;

import javax.persistence.*;


@Entity
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column
    private String firstName;
    @NotNull
    @Column
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

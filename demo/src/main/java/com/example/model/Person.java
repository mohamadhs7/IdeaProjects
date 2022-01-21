package com.example.model;

import lombok.*;

@Data
@AllArgsConstructor
public final class Person {
    private long id;
    private String firstName;
    private String lastName;
}

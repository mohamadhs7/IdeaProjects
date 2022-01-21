package com.example.model;

import lombok.Data;

@Data
public final class SavePersonRequest {
    private String firstName;
    private String lastName;
}
package com.holydayzer.api.controllers;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Holiday {
    @Id
    private String date;
    private String name;

    public String getDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDate'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

}

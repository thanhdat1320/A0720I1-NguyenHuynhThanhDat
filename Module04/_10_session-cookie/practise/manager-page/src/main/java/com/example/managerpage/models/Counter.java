package com.example.managerpage.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Counter {
    @Id
    private int count;

    public int increment() {
        return count++;
    }
}

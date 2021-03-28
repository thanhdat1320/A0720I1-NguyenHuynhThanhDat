package com.example.bookaop.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Card {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "idBook", nullable = false)
    private Book book;

}

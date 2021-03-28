package com.example.bookaop.service;

import com.example.bookaop.models.Card;

import java.util.List;

public interface CardService {
    List<Card> findAll();
    Card findById(int id);
    void save(Card card);
    void delete(int id);
}

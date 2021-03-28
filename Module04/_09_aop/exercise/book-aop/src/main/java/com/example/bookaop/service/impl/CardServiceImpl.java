package com.example.bookaop.service.impl;

import com.example.bookaop.models.Card;
import com.example.bookaop.repositories.CardRepository;
import com.example.bookaop.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public List<Card> findAll() {
        return this.cardRepository.findAll();
    }

    @Override
    public Card findById(int id) {
        return this.cardRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Card card) {
        this.cardRepository.save(card);
    }

    @Override
    public void delete(int id) {
        this.cardRepository.deleteById(id);
    }
}

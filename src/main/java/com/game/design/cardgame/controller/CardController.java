package com.game.design.cardgame.controller;

import com.game.design.cardgame.entity.Card;
import com.game.design.cardgame.entity.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deck/")
public class CardController {

    @Autowired
    private Deck deck;

    @GetMapping("/draw")
    public Card drawCard() {
        return deck.drawCard();
    }

    @GetMapping("/shuffle")
    public String shuffleDeck() {
        deck.shuffleDeck();
        return "Deck Shuffled";
    }
}

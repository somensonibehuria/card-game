package com.game.design.cardgame.service.impl;

import com.game.design.cardgame.entity.Card;
import com.game.design.cardgame.service.DeckService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DeckServiceImpl implements DeckService {

    private List<Card> deck;

    public DeckServiceImpl() {
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        deck = new ArrayList<>();
        for (String suit : new String[]{"Spades", "Hearts", "Diamonds", "Clubs"}) {
            for (String value : new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}) {
                deck.add(new Card(value, suit));
            }
        }
    }

    @Override
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    @Override
    public Card drawCard() {
        if (deck.isEmpty()) {
            return null; // No more cards left in the deck
        }
        return deck.remove(deck.size() - 1); // Draw the top card
    }

}

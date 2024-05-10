package com.game.design.cardgame.service;

import com.game.design.cardgame.entity.Card;

public interface DeckService {
    void shuffleDeck();
    Card drawCard();
}

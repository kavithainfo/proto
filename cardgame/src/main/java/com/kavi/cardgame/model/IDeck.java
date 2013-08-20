package com.kavi.cardgame.model;

import java.util.List;

public interface IDeck
{
    public List<Card> getCards();

    public void shuffle();

    public List<Card> draw(int nNumberOfCards);



}

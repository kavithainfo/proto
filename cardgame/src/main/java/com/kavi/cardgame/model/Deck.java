package com.kavi.cardgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck implements IDeck
{
    private final List<Card> cardsPack;
    private final List<Card> drawnCardsList;
    public Deck()
    {
        cardsPack = new ArrayList<Card>();
        drawnCardsList = new ArrayList<Card>();
        initialise();
    }


    private void initialise()
    {
        for(Suite suite: Suite.values())
        {
            for(Rank rank: Rank.values())
            {
                cardsPack.add(new Card(suite, rank));
            }
        }
    }


    @Override
    public List<Card> getCards()
    {
        return cardsPack;
    }


    @Override
    public void shuffle()
    {
        Collections.shuffle(cardsPack);
    }


    @Override
    public List<Card> draw(int nNumberOfCards)
    {
        Random randomNumberGenerator = new Random();
        // generate n random numbers specified in the parameter @nNumberOfCards between 0 to the card pack size (originally 52)
        int[] nRandonIndexesOfCards = new int[nNumberOfCards];

        for(int i = 0; i< nNumberOfCards; i++)
        {
            int randomIndexOfCard = Math.abs(randomNumberGenerator.nextInt(cardsPack.size()));
            System.out.println(randomIndexOfCard);
            nRandonIndexesOfCards[i] = randomIndexOfCard;
        }


        // add the drawn cards to a new list
        for(int n = 0; n < nRandonIndexesOfCards.length; n++)
        {
            Card drawnCard = cardsPack.get(nRandonIndexesOfCards[n]);
            drawnCardsList.add(drawnCard);
        }

        // update the current deck of cards to reflect that n number of cards have been drawn out of the pack
        for(Card drawnCard: drawnCardsList)
        {
            cardsPack.remove(drawnCard);
        }

        return drawnCardsList;
    }


}

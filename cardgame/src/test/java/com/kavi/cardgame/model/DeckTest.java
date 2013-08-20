package com.kavi.cardgame.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class DeckTest {



    @Test
    public void testInitialiseDeck()
    {
        IDeck deck = new Deck();
        List<Card> cards = deck.getCards();
        assertEquals(52,  cards.size());
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.ACE)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.TWO)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.THREE)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.FOUR)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.FIVE)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.SIX)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.SEVEN)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.EIGHT)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.NINE)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.TEN)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.JACK)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.QUEEN)));
        assertTrue(cards.contains(new Card(Suite.ACE, Rank.KING)));

        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.ACE)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.TWO)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.THREE)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.FOUR)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.FIVE)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.SIX)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.SEVEN)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.EIGHT)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.NINE)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.TEN)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.JACK)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.QUEEN)));
        assertTrue(cards.contains(new Card(Suite.HEARTS, Rank.KING)));

        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.ACE)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.TWO)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.THREE)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.FOUR)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.FIVE)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.SIX)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.SEVEN)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.EIGHT)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.NINE)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.TEN)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.JACK)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.QUEEN)));
        assertTrue(cards.contains(new Card(Suite.CLUBS, Rank.KING)));


        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.ACE)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.TWO)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.THREE)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.FOUR)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.FIVE)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.SIX)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.SEVEN)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.EIGHT)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.NINE)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.TEN)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.JACK)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.QUEEN)));
        assertTrue(cards.contains(new Card(Suite.DIAMOND, Rank.KING)));

    }

    @Test
    public void testShuffleDeck()
    {
        IDeck deck = new Deck();
        List<Card> cards = deck.getCards();
        Card cardFirst = cards.get(0);

        deck.shuffle();
        List<Card> shuffledCards = deck.getCards();
        Card shuffledCardFirst = shuffledCards.get(0);

        // check that the the first card in the shuffled pack is not the same
        assertTrue(!cardFirst.equals(shuffledCardFirst));


    }

    @Test
    public void testDraw_ONE_Card()
    {
        IDeck deck = new Deck();
        List<Card> drawnCards = deck.draw(1);
        assertEquals(1, drawnCards.size());
        for(Card card: drawnCards)
        {
            System.out.println("Drawn card: " + card.getSuite().name() + "-" + card.getRank().name());
        }
        assertEquals(51, deck.getCards().size());
    }

    @Test
    public void testDraw_TWO_Cards()
    {
        IDeck deck = new Deck();
        List<Card> drawnCards = deck.draw(2);
        assertEquals(2, drawnCards.size());
        for(Card card: drawnCards)
        {
            System.out.println("Drawn card: " + card.getSuite().name() + "-" + card.getRank().name());
        }
        assertEquals(50, deck.getCards().size());
    }

    @Test
    public void testDraw_N_Cards()
    {
        IDeck deck = new Deck();
        List<Card> drawnCards = deck.draw(10);
        assertEquals(10, drawnCards.size());
        for(Card card: drawnCards)
        {
            System.out.println("Drawn card: " + card.getSuite().name() + "-" + card.getRank().name());
        }
        assertEquals(42, deck.getCards().size());
    }



}

package com.kavi.cardgame.model;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

public class DeckTest {

    private final IDeck deck = new Deck();

    @Test
    public void testInitialiseDeck()
    {
        List<Card> cards = deck.getCards();
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
        fail("Not yet implemented");
    }

    @Test
    public void testDraw_ONE_Card()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testDraw_TWO_Cards()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testDraw_N_Cards()
    {
        fail("Not yet implemented");
    }



}

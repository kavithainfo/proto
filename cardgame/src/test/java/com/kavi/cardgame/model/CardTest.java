package com.kavi.cardgame.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest
{

    @Test
    public void testSuite_ACE()
    {
        Card card = new Card(Suite.ACE, Rank.ACE);
        assertEquals(Suite.ACE, card.getSuite());
    }

    @Test
    public void testSuite_HEARTS()
    {
        Card card = new Card(Suite.HEARTS, Rank.ACE);
        assertEquals(Suite.HEARTS, card.getSuite());
    }

    @Test
    public void testSuite_CLUBS()
    {
        Card card = new Card(Suite.CLUBS, Rank.ACE);
        assertEquals(Suite.CLUBS, card.getSuite());
    }

    @Test
    public void testSuite_DIAMOND()
    {
        Card card = new Card(Suite.DIAMOND, Rank.ACE);
        assertEquals(Suite.DIAMOND, card.getSuite());
    }

    @Test
    public void testRank_ACE()
    {
        Card card = new Card(Suite.ACE, Rank.ACE);
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void testRank_TWO()
    {
        Card card = new Card(Suite.ACE, Rank.TWO);
        assertEquals(Rank.TWO, card.getRank());
    }

    @Test
    public void testRank_THREE()
    {
        Card card = new Card(Suite.ACE, Rank.THREE);
        assertEquals(Rank.THREE, card.getRank());
    }

    @Test
    public void testRank_FOUR()
    {
        Card card = new Card(Suite.ACE, Rank.FOUR);
        assertEquals(Rank.FOUR, card.getRank());
    }

    @Test
    public void testRank_FIVE()
    {
        Card card = new Card(Suite.ACE, Rank.FIVE);
        assertEquals(Rank.FIVE, card.getRank());
    }


}

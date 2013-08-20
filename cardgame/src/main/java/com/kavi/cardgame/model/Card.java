package com.kavi.cardgame.model;

public class Card
{
    private final Suite suite;
    private final Rank rank;

    public Card(Suite suite, Rank rank)
    {
        this.suite = suite;
        this.rank = rank;
    }

    public Suite getSuite()
    {
        return suite;
    }

    public Rank getRank()
    {
        return rank;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Card))
        {
            return false;
        }

        Card cardOther = (Card)obj;
        if(suite == cardOther.getSuite() && rank == cardOther.getRank())
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()
    {

        return 0;
    }

}

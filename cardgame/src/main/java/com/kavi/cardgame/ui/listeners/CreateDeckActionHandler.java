package com.kavi.cardgame.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.kavi.cardgame.model.Card;
import com.kavi.cardgame.model.Deck;
import com.kavi.cardgame.model.IDeck;

public class CreateDeckActionHandler extends Observable implements ActionListener
{

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    private List<Card> deckOfCards;

    public ArrayList<Observer> getObservers()
    {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers)
    {
        this.observers = observers;
    }

    public void notifyObservers(Observable observable, List<Card> deckOfCards)
    {
        System.out.println("Notifying to all the subscribers when product became available");
        for (Observer ob : observers)
        {
            ob.update(observable, deckOfCards);
        }

    }

    public void registerObserver(Observer observer)
    {
        observers.add(observer);

    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        IDeck deck = new Deck();
        deckOfCards = deck.getCards();
        notifyObservers(this, deckOfCards);
    }

}
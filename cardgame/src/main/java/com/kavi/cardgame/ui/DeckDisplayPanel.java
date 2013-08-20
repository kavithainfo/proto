package com.kavi.cardgame.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import com.kavi.cardgame.model.Card;
import com.kavi.cardgame.ui.tables.DeckDisplayTable;

public class DeckDisplayPanel extends JPanel implements Observer
{
    private DeckDisplayTable table;
    public DeckDisplayPanel()
    {
        init();
    }

    private void init()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // add table
        table = new DeckDisplayTable();
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 3;
        c.gridheight = 5;
        c.gridx = 0;
        c.gridy = 0;
        add(table);

    }

    @Override
    public void update(Observable o, Object arg)
    {
        List<Card> deckOfCards = (List<Card>)arg;
        table.getTableModel().setData(deckOfCards);
    }

}

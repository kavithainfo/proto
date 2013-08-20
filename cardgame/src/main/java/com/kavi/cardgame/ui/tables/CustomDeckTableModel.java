package com.kavi.cardgame.ui.tables;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.kavi.cardgame.model.Card;

public class CustomDeckTableModel extends AbstractTableModel
{
    private List<Card> deckOfCardsArray;
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    public void setData(List<Card> deckOfCards)
    {
        if(deckOfCards == null)
        {

        }
        this.deckOfCardsArray = deckOfCards;
    }

    @Override
    public int getRowCount()
    {

        if(deckOfCardsArray == null)
        {
            return 0;
        }
        return deckOfCardsArray.size();
    }

    @Override
    public int getColumnCount()
    {
        return 1;
    }

    @Override
    public void setValueAt(Object value, int row, int col)
    {
        fireTableCellUpdated(row, col);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        if(deckOfCardsArray == null)
        {
            return null;
        }
        Card card = deckOfCardsArray.get(rowIndex);
        StringBuilder builder = new StringBuilder();
        builder.append(card.getSuite());
        builder.append(" - ");
        builder.append(card.getRank());
        return builder.toString();
    }

}

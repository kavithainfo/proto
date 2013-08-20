package com.kavi.cardgame.ui.tables;

import javax.swing.JTable;

public class DeckDisplayTable extends JTable
{
    public DeckDisplayTable()
    {
        super(new CustomDeckTableModel());
    }

    public CustomDeckTableModel getTableModel()
    {
        return (CustomDeckTableModel)getModel();
    }


}

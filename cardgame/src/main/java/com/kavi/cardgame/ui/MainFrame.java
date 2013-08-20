package com.kavi.cardgame.ui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import com.kavi.cardgame.ui.listeners.CreateDeckActionHandler;

public class MainFrame extends JFrame
{
    public static final String FILE_MENU_TEXT = "File";
    public static final String CREATE_DECK_TEXT = "Create New Deck Of Cards";

    public MainFrame()
    {
        super("Deck Of Cards Application");

        init();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension maximumSize = getMaximumSize();
        setSize(maximumSize.width, maximumSize.height);
        setVisible(true);

    }

    private void init()
    {
        JMenu fileMenu = new JMenu(FILE_MENU_TEXT);
        JMenuItem createNewDeckMenuItem = new JMenuItem(CREATE_DECK_TEXT);
        CreateDeckActionHandler createDeckActionHandler = new CreateDeckActionHandler();

        createNewDeckMenuItem.addActionListener(createDeckActionHandler);

        fileMenu.add(createNewDeckMenuItem);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);


        // create panels
        DeckDisplayPanel deckDisplayPanel = new DeckDisplayPanel();
        createDeckActionHandler.registerObserver(deckDisplayPanel);
        JScrollPane deckscrollPane = new JScrollPane(deckDisplayPanel);

        DrawnCardsDisplayPanel drawnCardsDisplayPanel = new DrawnCardsDisplayPanel();
        createDeckActionHandler.registerObserver(drawnCardsDisplayPanel);
        JScrollPane drawnCardscrollPane = new JScrollPane(drawnCardsDisplayPanel);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, deckscrollPane, drawnCardscrollPane);


        getContentPane().add(splitPane );

    }

}

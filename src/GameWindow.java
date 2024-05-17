import java.awt.Dimension;                  // Optische Spielefenstererstellung
import javax.swing.JFrame;                  //
import javax.swing.JPanel;                  //

import javax.swing.JMenuBar;                // Für die Menüleiste
import javax.swing.JMenu;                   //
import javax.swing.JMenuItem;               //

import java.awt.event.ActionEvent;          //Damit der Cursor beim Klick etwas auslöst
import java.awt.event.ActionListener;       //
import java.awt.event.WindowAdapter;        //
import java.awt.event.WindowEvent;          //

public class GameWindow extends JFrame{

    public GameWindow() {

        JPanel testPanel = new JPanel();
        testPanel.setPreferredSize(new Dimension(1500, 700));        //Länge und Breite des Fensters

        registerWindowListener();
        createMenu();                       //Menü-Erstellung

        add(testPanel);
        pack();

        setTitle("Clickit");                //Name oben drüber
        setLocation(1, 1);            //Position beim Aufruf des Fensters
        setResizable(true);

        setVisible(true);
    }

    private void registerWindowListener() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            @Override
            public void windowDeactivated(WindowEvent e) {

            }
            @Override
            public void windowActivated(WindowEvent e) {

            }
        });
    }

    private void createMenu() {

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");     //Menüzeile beschriften mit gewollten Punkten
        JMenu gameMenu = new JMenu("Game");


        menuBar.add(fileMenu);
        menuBar.add(gameMenu);


        addFileMenuItems(fileMenu);
    }

    private void addFileMenuItems(JMenu fileMenu) {

        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        quitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
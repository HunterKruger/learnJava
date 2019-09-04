package ISMIN.MineSweeper;

import java.awt.* ;
import java.awt.event.KeyEvent;
import javax.swing.* ;


public class IhmMinesweeper extends JPanel {

    public IhmMinesweeper(AppMinesweeper app) {

        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());

        JMenuBar menuBar =  new JMenuBar();
        JMenu menuPart1 = new JMenu("Click me ");
        JMenuItem menuPart1Item1 = new JMenuItem("Quit", KeyEvent.VK_Q);
        menuPart1Item1.addActionListener(new ActionMinesweeper(ActionMinesweeper.QUIT,app));
        menuPart1.add(menuPart1Item1);
        menuBar.add(menuPart1);
        app.setJMenuBar(menuBar);

        JPanel infoGame = new JPanel();
        infoGame.setLayout(new GridLayout(1,3));
        JLabel scoreGame = new JLabel("Score");
        JLabel welcomeGame = new JLabel("Welcome to Minesweeper!");
        JLabel levelGame = new JLabel(app.getMineField().getNiveau());
        infoGame.add(scoreGame);
        infoGame.add(welcomeGame);
        infoGame.add(levelGame);
        add(infoGame,BorderLayout.NORTH);

        JPanel panelMines = new JPanel();
        panelMines.setLayout(new GridLayout(app.getMineField().getDimension(),app.getMineField().getDimension()));
        for (int i = 0; i < app.getMineField().getDimension(); i++) {
            for (int j = 0; j < app.getMineField().getDimension(); j++) {
                if(app.getMineField().isMine(i,j)){
                    panelMines.add(new JLabel("x"));
                }else{
                    panelMines.add(new JLabel(String.valueOf(app.getMineField().calculateMinesAround(i,j))));
                }
            }
        }
        add(panelMines,BorderLayout.CENTER);

        JButton buttonQuit = new JButton("Quit");
        buttonQuit.addActionListener( new ActionMinesweeper(ActionMinesweeper.QUIT, app));
        add(buttonQuit,BorderLayout.SOUTH);

    }
}
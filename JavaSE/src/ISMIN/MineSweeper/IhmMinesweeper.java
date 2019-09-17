package ISMIN.MineSweeper;

import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.* ;


public class IhmMinesweeper extends JPanel {

    private Case[][] tabCases;
    private Counter counter;

    public Counter getTime() {
        return counter;
    }

    public Case[][] getTabCases() {
        return tabCases;
    }

    public IhmMinesweeper(AppMinesweeper app) {

        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());

        JMenuBar menuBar =  new JMenuBar();

        JMenu start = new JMenu("Start ");
        JMenuItem quit = new JMenuItem("Quit", KeyEvent.VK_Q);
        // click control+E to quit this game
        quit.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        quit.addActionListener(new ActionMinesweeper(ActionMinesweeper.QUIT,app));

        JMenuItem newGame = new JMenuItem("New game", KeyEvent.VK_T);
        newGame.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        newGame.addActionListener(new ActionMinesweeper(ActionMinesweeper.NEWGAME,app));

        JMenu newGame2 = new JMenu("New game...");

        JMenuItem easy = new JMenuItem("EASY", KeyEvent.VK_E);
        easy.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        easy.addActionListener(new ActionMinesweeper(ActionMinesweeper.EASY,app));


        JMenuItem normal = new JMenuItem("NORMAL", KeyEvent.VK_N);
        normal.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        normal.addActionListener(new ActionMinesweeper(ActionMinesweeper.NORMAL,app));


        JMenuItem hard = new JMenuItem("HARD", KeyEvent.VK_H);
        hard.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        hard.addActionListener(new ActionMinesweeper(ActionMinesweeper.HARD,app));

        newGame2.add(easy);
        newGame2.add(normal);
        newGame2.add(hard);

        //menuPart1Item2.setEnabled(false); //disable the New game button

        start.add(newGame);  //new game
        start.add(newGame2);  //new game...
        start.add(quit);  //quit

        JMenu help = new JMenu("Help");
        JMenuItem levelInfo = new JMenuItem("Level information", KeyEvent.VK_L);
        levelInfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        levelInfo.addActionListener(new ActionMinesweeper(ActionMinesweeper.LEVELINFO,app));

        help.add(levelInfo);
        JMenuItem aboutAuthor = new JMenuItem("About author", KeyEvent.VK_A);
        aboutAuthor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        aboutAuthor.addActionListener(new ActionMinesweeper(ActionMinesweeper.ABOUTAUTHOR,app));
        help.add(aboutAuthor);

        menuBar.add(start);
        menuBar.add(Box.createGlue());  //put the next menuPart to the right side
        menuBar.add(help);
        app.setJMenuBar(menuBar);

        JPanel infoGame = new JPanel();
        infoGame.setLayout(new GridLayout(1,3));

        JPanel left = new JPanel();
        left.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel mineGame = new JLabel("Mines:"+app.getMineField().getNumMines());
        //mineGame.addActionListener((new ActionMinesweeper(ActionMinesweeper.MIUNSMINES,app)));
        left.add(mineGame);

        JPanel center = new JPanel();
        center.setLayout(new FlowLayout(FlowLayout.CENTER));
        counter = new Counter();
        counter.setText(String.valueOf(counter.getProcessTime()));
        //Icon icon = new ImageIcon("img/happy.png");
        //face.setIcon(icon);
        center.add(counter);

        JPanel right = new JPanel();
        right.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel levelGame = new JLabel(app.getMineField().getLevel());
        right.add(levelGame);

        infoGame.add(left);
        infoGame.add(center);
        infoGame.add(right);
        add(infoGame,BorderLayout.NORTH);

        JPanel panelMines = new JPanel();
        //System.out.println(app.getMineField().getDimension());
        panelMines.setLayout(new GridLayout(app.getMineField().getDimension(),app.getMineField().getDimension()));

        tabCases = new Case[app.getMineField().getDimension()][app.getMineField().getDimension()];
        for (int i = 0; i < app.getMineField().getDimension(); i++) {
            for (int j = 0; j < app.getMineField().getDimension(); j++) {
                tabCases[i][j]=new Case(i,j,app);
                panelMines.add(tabCases[i][j]);
//                if(app.getMineField().isMine(i,j)){
//                    //panelMines.add(new JLabel("x"));
//                    panelMines.add(new JLabel(new ImageIcon(new ImageIcon("img/bomb.png").
//                            getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))));
//                }else{
//                    panelMines.add(new JLabel(String.valueOf(app.getMineField().calculateMinesAround(i,j))));
//                }
            }
        }
        add(panelMines,BorderLayout.CENTER);

        JButton buttonQuit = new JButton("Quit");
        buttonQuit.addActionListener( new ActionMinesweeper(ActionMinesweeper.QUIT, app));
        add(buttonQuit,BorderLayout.SOUTH);
    }

}
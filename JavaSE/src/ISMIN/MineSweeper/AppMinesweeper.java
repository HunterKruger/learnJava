package ISMIN.MineSweeper;

import javax.swing.*;

public class AppMinesweeper extends JFrame {

    private MineField mineField = new MineField(MineField.Level.HARD);

    public AppMinesweeper() {

        //mineField.initChamp();
        mineField.showText();

        IhmMinesweeper ihm= new IhmMinesweeper(this) ;
        setContentPane(ihm) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack() ;
        setVisible(true) ;

        System.out.println();
        mineField.showTextWithMinesNum();
//        System.out.println(champ.calculateMinesAround(1,1));
//        System.out.println();

    }

    public MineField getMineField() {
        return mineField;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Minesweeper!");
        new AppMinesweeper();
    }

    public void quit(){
        int response= JOptionPane.showConfirmDialog(null,
                "Are you sure to quit the game?", "Bye-Bye",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
            System.exit(0) ;
        }
    }
}

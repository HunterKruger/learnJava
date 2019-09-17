package ISMIN.MineSweeper;

import javax.swing.*;

public class AppMinesweeper extends JFrame {

    private MineField mineField = new MineField();
    private IhmMinesweeper ihm ;
    public AppMinesweeper() {
        mineField.showText();
        ihm= new IhmMinesweeper(this) ;
        setContentPane(ihm) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack() ;
        setVisible(true) ;
        mineField.showTextWithMinesNum();
//        System.out.println(champ.calculateMinesAround(1,1));
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

    public void newgame(){
        newgame(mineField.getLevel());
    }

    public void newgame(String level){
        mineField.initChamp(level);
        mineField.showText();
        ihm= new IhmMinesweeper(this) ;
        setContentPane(ihm) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack() ;
        setVisible(true) ;
        mineField.showTextWithMinesNum();
        for (int i = 0; i < mineField.getDimension(); i++) {
            for (int j = 0; j < mineField.getDimension(); j++) {
                ihm.getTabCases()[i][j].newgame();
            }
        }
    }

    public void levelInformation(){
        int response= JOptionPane.showConfirmDialog(null,
                "Easy:10*10, 20 mines \nNormal:20*20, 80 mines\nHard:30*30, 350 mines", "Level information",
                JOptionPane.CLOSED_OPTION);
        if(response==JOptionPane.CLOSED_OPTION){
            System.exit(0) ;
        }
    }

    public void aboutAuthor(){
        int response= JOptionPane.showConfirmDialog(null,
                "FENG Yuan\nform EMSE", "About author",
                JOptionPane.CLOSED_OPTION);
        if(response==JOptionPane.CLOSED_OPTION){
            System.exit(0) ;
        }
    }

//    public void mineClicked(){
//        mineField.mineClicked();
//    }
}

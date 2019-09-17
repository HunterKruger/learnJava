package ISMIN.MineSweeper;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppMinesweeper extends JFrame {

    private MineField mineField = new MineField();
    private int numMineDiscovered=0;
    private IhmMinesweeper ihm ;
    private boolean started = false;
    private boolean lost = false;

    public void resetNumMineDiscovered() {
        this.numMineDiscovered = 0;
    }

    public int getNumMineDiscovered() {
        return numMineDiscovered;
    }

    public void increaseNumMineDiscovered() {
        numMineDiscovered++;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public boolean isLost() {
        return lost;
    }

    public IhmMinesweeper getIhm() {
        return ihm;
    }

    public boolean isStarted(){return started;}

    public void setStarted(boolean started){
        this.started=started;
    }

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

        ihm.getTime().stopCounter();
        this.setLost(false);
        this.setStarted(false);

        setVisible(true) ;
        mineField.showTextWithMinesNum();
        for (int i = 0; i < mineField.getDimension(); i++) {
            for (int j = 0; j < mineField.getDimension(); j++) {
                ihm.getTabCases()[i][j].newgame();
            }
        }
        resetNumMineDiscovered();
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

    public boolean isWin() {
        System.out.println("numMineDiscovered="+getNumMineDiscovered());
        boolean win = numMineDiscovered + mineField.getNumMines() + 1 == mineField.getDimension() * mineField.getDimension();
//        if(win){
//            saveResult();
//        }
        return win;
    }

    private void saveResult(){
        Path path = Paths.get("/Users/FY/Desktop/workspaceMac/learnJava/JavaSE/file/mineTime.txt");
        if(!Files.exists(path)){

        }
    }

//    public int readResult(){
//        DataInputStream dis= null;
//        try {
//            dis = new DataInputStream(new FileInputStream("/Users/FY/Desktop/workspaceMac/learnJava/JavaSE/file/mineTime.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while (true) {
//            int n = 0;
//            try {
//                n = dis.readInt();
//                System.out.println();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }

}

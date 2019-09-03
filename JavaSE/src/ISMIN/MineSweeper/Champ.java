package ISMIN.MineSweeper;

import java.util.* ;

public class Champ {

//    private int numMines ;
//    private int dimension ;
    private int numMines;
    private int dimension;
    private Random random = new Random();
    private boolean [][] mineField;
    public enum Level{EASY,NORMAL,HARD}

    public Champ(){   //EASY by default
        this(Level.EASY);
        dimension = 10;
        numMines = 20;
        initChamp();
    }

    public Champ(Level level){
        if(level==Level.EASY){
            dimension = 10;
            numMines = 20;
        }
        if(level==Level.NORMAL){
            dimension = 20;
            numMines = 80;
        }
        if(level==Level.HARD){
            dimension = 30;
            numMines = 200;
        }
        initChamp();
    }

    public void initChamp(){
        mineField = new boolean[dimension][dimension];
        placeMines();
    }


    public void placeMines(){
        //clear all mines
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                mineField [i][j] = false;
            }
        }
        //deploy mines
        for (int i = 0; i < numMines; i++) {
            int x = random.nextInt(dimension); // x=[0, DIM-1]
            int y = random.nextInt(dimension); // y=[0, DIM-1]
            mineField [x][y] = true;
        }
    }

    public void showText(){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(mineField[i][j] == true) {
                    System.out.print("X ");
                }else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    public int calculateMinesAround(int x, int y){
        int numMinesAround=0;
        boolean[][] expand = new boolean[dimension+2][dimension+2];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                expand[i+1][j+1]=mineField[i][j];
            }
        }
        int xx=x+1;
        int yy=y+1;
        if(expand[xx-1][yy-1]==true)
            numMinesAround++;
        if(expand[xx-1][yy]==true)
            numMinesAround++;
        if(expand[xx-1][yy+1]==true)
            numMinesAround++;
        if(expand[xx][yy-1]==true)
            numMinesAround++;
        if(expand[xx][yy+1]==true)
            numMinesAround++;
        if(expand[xx+1][yy-1]==true)
            numMinesAround++;
        if(expand[xx+1][yy]==true)
            numMinesAround++;
        if(expand[xx+1][yy+1]==true)
            numMinesAround++;
//        for (int i = 0; i < dimension + 2; i++) {
//            for (int j = 0; j < dimension + 2; j++) {
//                System.out.print(expand[i][j]+" ");
//            }
//            System.out.println();
//        }
        return numMinesAround;
    }

    public void showTextWithMinesNum(){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(mineField[i][j] == true) {
                    System.out.print("X ");
                }else {
                    System.out.print(calculateMinesAround(i, j)+" ");
                }
            }
            System.out.println();
        }
    }

}
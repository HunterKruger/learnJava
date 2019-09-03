package ISMIN.Seance1;
import java.util.* ;

public class Champ {

    final static int NUMBERMINES = 5 ;
    final static int DIMENSION = 10;
    Random random = new Random();
    boolean [][] mineField = new boolean[DIMENSION][DIMENSION];

    public void placeMines(){
        //clear all mines
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                mineField [i][j] = false;
            }
        }
        //deploy mines
        for (int i = 0; i < NUMBERMINES; i++) {
            int x = random.nextInt(DIMENSION); // x=[0, DIM-1]
            int y = random.nextInt(DIMENSION); // y=[0, DIM-1]
            mineField [x][y] = true;
        }
    }

    public void showText(){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if(mineField[i][j] == true) {
                    System.out.print("X ");
                }else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

}

package ISMIN.MineSweeper;

public class Minesweeper {

    private Champ champ = new Champ(Champ.Level.NORMAL);
    //private Champ champ = new Champ();

    public Minesweeper() {
        champ.initChamp();
        champ.showText();
        System.out.println();
        champ.showTextWithMinesNum();
        //System.out.println(champ.calculateMinesAround(1,1));
//        System.out.println();
//        champ.placeMines();
//        champ.showText();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Minesweeper!");
        new Minesweeper();
    }
}

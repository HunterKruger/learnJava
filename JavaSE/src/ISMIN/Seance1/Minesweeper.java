package ISMIN.Seance1;

public class Minesweeper {
    public static void main(String[] args) {
        Champ champ = new Champ();
        champ.placeMines();
        champ.showText();

        System.out.println();
        champ.placeMines();
        champ.showText();
    }
}

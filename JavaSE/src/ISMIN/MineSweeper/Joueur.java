package ISMIN.MineSweeper;

public class Joueur {
    private int score;
    private String name;

    public Joueur(int score, String name) {
        this.score = score;
        this.name = new String(name);
    }

    public Joueur() {
        score = 0;
    }

    public Joueur(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

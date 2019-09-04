package ISMIN.MineSweeper;

public class Player {
    private int score;
    private String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = new String(name);
    }

    public Player() {
        score = 0;
    }

    public Player(int score) {
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

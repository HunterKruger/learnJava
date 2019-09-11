package ISMIN.MineSweeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionMinesweeper implements ActionListener {

    public static final int QUIT = 0;
    public static final int NEWGAME = 1;
    public static final int LEVELINFO = 2;
    public static final int ABOUTAUTHOR = 3;
    public static final int EASY = 4;
    public static final int NORMAL = 5;
    public static final int HARD = 6;
    public static final int MIUNSMINES = 7;

    private AppMinesweeper app;
    private int type;


    public ActionMinesweeper(int type, AppMinesweeper app) {
        this.app = app;
        this.type = type;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(type==QUIT){
            app.quit();
        }
        if(type==NEWGAME){
            app.newgame();
        }
        if(type==LEVELINFO){
            app.levelInformation();
        }
        if(type==ABOUTAUTHOR){
            app.aboutAuthor();
        }
        if(type==EASY){
            app.newgame("EASY");
        }
        if(type==NORMAL){
            app.newgame("NORMAL");
        }
        if(type==HARD){
            app.newgame("HARD");
        }
//        if(type==MIUNSMINES){
//            app.mineClicked();
//        }
    }
}

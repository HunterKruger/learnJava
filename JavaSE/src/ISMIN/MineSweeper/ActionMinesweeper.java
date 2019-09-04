package ISMIN.MineSweeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionMinesweeper implements ActionListener {

    public static final int QUIT = 0;
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
    }
}

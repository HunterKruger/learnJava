package Visual;

import java.awt.Color;
import java.awt.Frame;
public class FirstFrame extends Frame{
    public static void main(String args[]){
	    FirstFrame fr=new FirstFrame("First container!");
	    fr.setSize(240,240);
	    fr.setBackground(Color.yellow);  
	    fr.setVisible(true);
	}
    public FirstFrame(String str){
	    super(str);     //call constructor from super class
	}
    public FirstFrame(){	 
    }
}

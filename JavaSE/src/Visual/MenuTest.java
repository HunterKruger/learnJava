package Visual;
import java.awt.*;
public class MenuTest{
    private Frame fr;
    public void create(){
	    fr=new Frame();
	    MenuBar mb=new MenuBar();
	    fr.setMenuBar(mb);
	    Menu m1=new Menu("File"); //menu
	    Menu m2=new Menu("Edit");
	    Menu m3=new Menu("Help");
	    MenuItem mi1=new MenuItem("Save"); //menu item
	    MenuItem mi2=new MenuItem("Load");
	    MenuItem mi3=new MenuItem("Quit");
	    m1.add(mi1);  
	    m1.add(mi2);
	    m1.addSeparator();    //add separator line
        m1.add(mi3);
	    mb.add(m1);   
	    mb.add(m2);
	    mb.setHelpMenu(m3); //set m3 as help menu of this menu container
	    fr.setSize(200,200);
	    fr.setVisible(true);		
	}
}
	

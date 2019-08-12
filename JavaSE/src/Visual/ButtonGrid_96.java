package Visual;
import java.awt.*;
public class ButtonGrid_96{
    public static void main(String args[]){
	Frame f=new Frame("GridLayout");
	f.setLayout(new GridLayout(3,2)); //the container is divided into 3 rows and 2 columns
	f.add(new Button("1"));
	f.add(new Button("2"));
	f.add(new Button("3"));
	f.add(new Button("4"));
	f.add(new Button("5"));
	f.add(new Button("6"));
	f.setSize(200,200);
	f.setVisible(true);		
	}
}

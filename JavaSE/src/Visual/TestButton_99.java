package Visual;
import java.awt.*;
import java.awt.event.*;
public class TestButton_99{
	public static void main(String args[]){
		Frame f=new Frame("Test");
		Button b=new Button("Press Me");
		b.addActionListener(new ButtonHandler());
		f.setLayout(new FlowLayout());
		f.add(b);
		f.setSize(200,200);
		f.setVisible(true);		
	}
}

class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Action occurred");
	}
}

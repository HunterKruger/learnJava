package Visual;
import java.awt.*;
import java.awt.event.*;
public class TestAddListener_910 implements ActionListener,WindowListener{
	Frame f;
	Button b;
	public void create(){
		f=new Frame("Add Listener");
		b=new Button("press me");
		b.addActionListener(this);
		f.addWindowListener(this);
		f.add(b,"North");
		f.setSize(200,200);
		f.setVisible(true);
	}
	public static void main(String args[]){
		TestAddListener_910 ta=new TestAddListener_910();
		ta.create();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
	}

}
	
package Visual;
import javax.swing.*;
public class HelloWorldSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame frame=new JFrame("Swing application");
        JLabel label=new JLabel("Hello World");
        JLabel label2=new JLabel("Hello World Again");
        frame.getContentPane().add(label);
        frame.getContentPane().add(label2);
        frame.setSize(200, 89);
        frame.setVisible(true);
	}

}

package Visual;
import java.awt.*;
public class TwoButton_93{
	private Frame f;
	private Button b1;
	private Button b2;
	public static void main(String args[]){
		TwoButton_93 two=new TwoButton_93();
		two.go();
	}
	public void go(){
		f=new Frame("FlowLayout");
		f.setLayout(new FlowLayout());
		b1=new Button("Press Me");
		b2=new Button("Don't Press Me");
		f.add(b1);
		f.add(b2);
		f.pack();  //Compaction
		f.setVisible(true);
	}
}

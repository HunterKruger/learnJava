package Visual;
import java.awt.*;
public class PanelInFrame extends Frame{
   public static void main(String args[]){
       PanelInFrame fr=new PanelInFrame("Frame with Panel");
       Panel pan=new Panel();
       fr.setSize(200,200);
       fr.setBackground(Color.yellow);
       fr.setLayout(null);   //cancel layout manager
       pan.setSize(100,100);
       pan.setBackground(Color.green);
       fr.add(pan);
       fr.setVisible(true);
   }
   public PanelInFrame(String str){ 
    	   super(str); 
   }
}

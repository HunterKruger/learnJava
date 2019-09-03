package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class ThreadEat extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(100);
                System.out.println("Eat!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

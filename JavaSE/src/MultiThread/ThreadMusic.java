package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class ThreadMusic extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(100);//线程休眠100ms
                System.out.println("Music!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

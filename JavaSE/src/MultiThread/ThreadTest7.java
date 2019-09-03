package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class ThreadTest7 implements Runnable {
    public void run(){
        for(int i=0;i<50;i++){
            Thread th=new Thread();
            System.out.println(th.currentThread().getName()+":"+i);//返回线程的名称

        }

    }

    public static void main(String[] args) {
        ThreadTest4 threadTest4=new ThreadTest4();
        Thread t1=new Thread(threadTest4);
        Thread t2=new Thread(threadTest4);
        Thread t3=new Thread(threadTest4);
        t1.start();
        t2.start();
        t2.interrupt();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

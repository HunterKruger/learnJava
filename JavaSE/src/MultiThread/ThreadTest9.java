package MultiThread;

/**
 * Created by FY on 16/12/16.
 */
public class ThreadTest9 implements Runnable{
    private int apple=10;
    @Override
    public synchronized void run() {
        synchronized (this){  //使用同步块
            while(apple>0){
                System.out.println(Thread.currentThread().getName()+" eats "+apple+" apples.");
                apple--;
            }
        }

    }

    public static void main(String[] args) {
        ThreadTest9 threadTest9=new ThreadTest9();
        new Thread(threadTest9,"Jack").start();
        new Thread(threadTest9,"Jon").start();
        new Thread(threadTest9,"Jazz").start();
    }
}

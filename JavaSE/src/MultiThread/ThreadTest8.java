package MultiThread;

/**
 * Created by FY on 16/12/16.
 */
public class ThreadTest8 implements Runnable{
    private int apple=10;
    @Override
    public synchronized void run() {  //只允许一个线程进入
        while(apple>0){
            System.out.println(Thread.currentThread().getName()+" eats "+apple+" apples.");
            apple--;
        }
    }

    public static void main(String[] args) {
        ThreadTest8 threadTest8=new ThreadTest8();
        new Thread(threadTest8,"Jack").start();
        new Thread(threadTest8,"Jon").start();
        new Thread(threadTest8,"Jazz").start();
    }
}

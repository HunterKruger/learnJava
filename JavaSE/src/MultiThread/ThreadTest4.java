package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class ThreadTest4 implements Runnable{
    public void run(){
        for (int i = 0; i <50; i++) {
            Thread th=new Thread();
            System.out.println(th.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest4 threadTest4=new ThreadTest4();
        Thread thread4=new Thread(threadTest4);
        System.out.println(thread4.isAlive());//判断线程当前是否存活
        thread4.start();
        System.out.println(thread4.isAlive());
    }
}

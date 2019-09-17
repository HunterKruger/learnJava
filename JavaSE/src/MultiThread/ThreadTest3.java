package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class ThreadTest3 implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            Thread th=new Thread();
            System.out.println(th.currentThread().getName()+":"+i);//返回线程的名称
        }
    }

    public static void main(String[] args) {
        ThreadTest3 threadTest3=new ThreadTest3();
        new Thread(threadTest3).start();
        new Thread(threadTest3).start();
        new Thread(threadTest3,"fy").start();
        new Thread(threadTest3,"ft").start();
    }
}

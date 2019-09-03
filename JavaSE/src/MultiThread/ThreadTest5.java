package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class ThreadTest5 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            Thread th=new Thread();
            System.out.println(th.currentThread().getName()+":"+i);//返回线程的名称
        }

    }

    public static void main(String[] args) {
        ThreadTest5 threadTest5=new ThreadTest5();
        Thread t1=new Thread(threadTest5,"A");
        Thread t2=new Thread(threadTest5,"B");
        Thread t3=new Thread(threadTest5,"C");
        //设置优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}

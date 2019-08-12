package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class ThreadTest6 implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            Thread th=new Thread();
            System.out.println(th.currentThread().getName()+":"+i);//返回线程的名称
            if(i==25){
                System.out.println("礼让");
                Thread.currentThread().yield();
            }
        }

    }
    public static void main(String[] args) {
        ThreadTest6 threadTest6=new ThreadTest6();
        new Thread(threadTest6,"Rabbit").start();
        new Thread(threadTest6,"Turtle").start();
    }
}

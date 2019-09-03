package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
//用Runnable接口实现
public class ThreadTest2 implements Runnable{

    private int candy=1;
    private String threadName;

    public ThreadTest2(String threadName) {
        super();
        this.threadName = threadName;
    }
    public int getCandy() {
        return candy;
    }
    public void setCandy(int candy) {
        this.candy = candy;
    }
    public String getThreadName() {
        return threadName;
    }
    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        while(candy<=100){
            System.out.println(threadName+" eats "+candy+" candies");
            candy++;
        }
    }
    public static void main(String[] args) {
        ThreadTest2 t1=new ThreadTest2("Amy");
        ThreadTest2 t2=new ThreadTest2("Andy");
        Thread t11=new Thread(t1);
        Thread t22=new Thread(t2);
        t11.start();
        t22.start();


    }

}
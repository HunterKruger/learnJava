package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
//用Thread类实现
public class ThreadTest1 extends Thread {
    private int candy=1;
    private String threadName;

    public ThreadTest1(String threadName) {
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
    @Override
    public void run() {
        while(candy<=100){
            System.out.println(threadName+" eat "+candy+" candies");
            candy++;
        }
    }
    public static void main(String[] args) {
        ThreadTest1 th1=new ThreadTest1("Jack");
        ThreadTest1 th2=new ThreadTest1("John");
        th1.start();
        th2.start();

    }
}
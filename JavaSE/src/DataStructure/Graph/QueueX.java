package DataStructure.Graph;

/**
 * Created by FY on 17/3/15.
 */
public class QueueX {
    private final int SIZE=20;
    private int[] queue;
    private int front;
    private int rear;
    public QueueX(){
        queue=new int[SIZE];
        front=0;
        rear=-1;
    }
    public void insert(int value){
        if(rear==SIZE-1)
            rear=-1;
        else
            queue[++rear]=value;
    }
    public int remove(){
        int temp=queue[front++];
        if(front==SIZE)
            front=0;
        return temp;
    }
    public boolean isEmpty(){
        return ((rear+1)==front)||((front+SIZE-1)==rear);
    }
}

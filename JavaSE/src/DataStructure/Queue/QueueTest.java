package DataStructure.Queue;

/**
 * Created by FY on 16/12/23.
 */
public class QueueTest {
    private int rear;
    private int front;
    private int maxSize;
    private int[] queueArray;
    private int elementCount;

    public QueueTest(int s){
        maxSize=s;
        queueArray=new int[maxSize];
        front=0;
        rear=-1;
        elementCount=0;
    }

    public void insert(int j){
        if(rear==maxSize-1)
            rear=-1;
        queueArray[++rear]=j;
        elementCount++;
    }

    public int remove(){
        int temp=queueArray[front++];
        if(front==maxSize)
            front=0;   //all data will be deleted
        elementCount--;
        return temp;
    }

    public int peekFront(){
        return queueArray[front];
    }

    public int peekRear(){
        return queueArray[rear];
    }

    public boolean isEmpty(){
        return (elementCount==0);
    }

    public boolean isFull(){
        return (elementCount==maxSize);
    }

    public int size(){
        return elementCount;
    }

    public static void main(String[] args) {
        QueueTest qt=new QueueTest(5);
        qt.insert(10);
        qt.insert(20);
        qt.insert(30);
        qt.insert(40);

        System.out.println(qt.peekFront());
        System.out.println(qt.peekRear());

        qt.remove();
        qt.remove();
        qt.remove();

        System.out.println(qt.peekFront());
        System.out.println(qt.peekRear());

        qt.insert(50);
        qt.insert(60);
        qt.insert(70);
        qt.insert(80);


        System.out.println();

        while(!qt.isEmpty()){
            int n=qt.remove();
            System.out.print(n+" ");
            System.out.println();
        }

    }
}

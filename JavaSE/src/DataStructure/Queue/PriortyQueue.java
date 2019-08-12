package DataStructure.Queue;

/**
 * Created by FY on 16/12/24.
 */
//数组必须降序排列
public class PriortyQueue {
    private int maxSize;
    private int elementCount;
    private int[] priortyArr;

    public PriortyQueue(int s){
        maxSize=s;
        priortyArr=new int[maxSize];
        elementCount=0;
    }

    public void insert(int item){
        int j;
        if(elementCount==0)
            priortyArr[elementCount++]=item;
        else{
            for(j=elementCount-1;j>=0;j--){
                if(item>priortyArr[j])
                    priortyArr[j+1]=priortyArr[j];
                else
                    break;
            }
            priortyArr[j+1]=item;
            elementCount++;
        }
    }

    public int remove(){
        return priortyArr[--elementCount];
    }

    public int peekMin(){
        return priortyArr[elementCount-1];
    }

    public boolean isEmpty(){
        return (elementCount==0);
    }

    public boolean isFull(){
        return (elementCount==maxSize);
    }

    public static void main(String[] args) {
        PriortyQueue pq=new PriortyQueue(5);
        pq.insert(28);
        pq.insert(92);
        pq.insert(56);
        pq.insert(44);
        pq.insert(72);

        while (!pq.isEmpty()){
            int temp=pq.remove();
            System.out.print(temp+" ");
        }

        System.out.println();
    }
}

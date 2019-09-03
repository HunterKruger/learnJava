package DataStructure.AdvancedSort.QuickSort;

/**
 * Created by FY on 17/2/22.
 */
public class ArrayPartition {
    private int elementCount;
    private int[] arr;
    public ArrayPartition(int max){
        arr=new int[max];
        elementCount=0;
    }
    public void insert(int value){
        arr[elementCount++]=value;
    }
    public int size(){
        return elementCount;
    }
    public void display(){
        for (int i = 0; i < elementCount; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void swap(int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public int partilion(int left,int right,int pivor){
        int leftPointer=left-1;
        int rightPointer=right+1;
        while (true){
            while (leftPointer<right&&arr[++leftPointer]<pivor);
            while (rightPointer>left&&arr[--rightPointer]>pivor);
            if(leftPointer>=rightPointer)
                break;
            else
                swap(leftPointer,rightPointer);

        }
        return leftPointer;
    }

    public static void main(String[] args) {
        int maxsize=20;
        ArrayPartition ap=new ArrayPartition(maxsize);
        for (int i = 0; i < maxsize; i++) {
            ap.insert((int)(java.lang.Math.random()*199));
        }
        ap.display();
        ap.partilion(0,maxsize-1,99);
        ap.display();
    }
}

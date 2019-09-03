package DataStructure.AdvancedSort.QuickSort;

/**
 * Created by FY on 17/2/22.
 */
public class ArrayQuickSort {
    private int elementCount;
    private int arr[];
    public ArrayQuickSort(int max){
        arr=new int[max];
        elementCount=0;
    }
    public void insert(int value){
        arr[elementCount++]=value;
    }
    public void swap(int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public void display(){
        for (int i = 0; i < elementCount; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int doPartition(int left,int right,int pivor){
        int leftPointer=left-1;
        int rightPointer=right;
        while (true) {
            while (arr[++leftPointer] < pivor) ;
            while (rightPointer>0&&arr[--rightPointer] > pivor) ;
            if (leftPointer >= rightPointer)
                break;
            else
                swap(leftPointer, rightPointer);
        }
        swap(leftPointer,right);
        return leftPointer;
    }
    public void recursionQuickSort(int left,int right){
        if((right-left)<=0)
            return;
        else{
            int pivor=arr[right];
            int partition=doPartition(left,right,pivor);
            recursionQuickSort(left,partition-1);
            recursionQuickSort(partition+1,right);
        }
    }
    public void quickSort(){
        recursionQuickSort(0,elementCount-1);
    }

    public static void main(String[] args) {
        int maxSize=50;
        ArrayQuickSort aqs=new ArrayQuickSort(maxSize);
        for (int i = 0; i < maxSize ; i++) {
            aqs.insert((int)(java.lang.Math.random()*199));
        }
        aqs.display();
        aqs.quickSort();
        aqs.display();
    }

}

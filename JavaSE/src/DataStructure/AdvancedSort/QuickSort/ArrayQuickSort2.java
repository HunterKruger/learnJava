package DataStructure.AdvancedSort.QuickSort;

/**
 * Created by FY on 17/2/23.
 */
public class ArrayQuickSort2 {
    private int elementCount;
    private int arr[];
    public ArrayQuickSort2(int max){
        arr=new int[max];
        elementCount=0;
    }
    public void insert(int value){
        arr[elementCount++]=value;
    }
    public void display(){
        for (int i = 0; i < elementCount ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void swap(int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public void quickSort2(){
        recursionQuickSort2(0,elementCount-1);
    }
    public int midOfThree(int left, int right){
        int center=(left+right)/2;
        if(arr[left]>arr[center])
            swap(left,center);
        if(arr[left]>arr[right])
            swap(left,right);
        if(arr[center]>arr[right])
            swap(center,right);
        swap(center,right-1);
        return arr[right-1];
    }
    public int doPartition2(int left,int right,int pivot){
        int leftPointer=left;
        int rightPointer=right-1;
        while (true) {
            while (arr[++leftPointer] < pivot) ;
            while (arr[--rightPointer] > pivot) ;
            if (leftPointer >= rightPointer)
                break;
            else
                swap(leftPointer, rightPointer);
        }
        swap(leftPointer,right-1);
        return leftPointer;
    }
    public void manualSort(int left,int right){
        int size=right-left+1;
        if(size<=1)
            return;
        if(size==2) {
            if(arr[left]>arr[right]) {
                swap(arr[left], arr[right]);
                return;
            }
        }else {
            if(arr[left]>arr[right-1])
                swap(left,right-1);
            if(arr[left]>arr[right])
                swap(left,right);
            if(arr[right-1]>arr[right])
                swap(right-1,right);
        }
    }
    public void recursionQuickSort2(int left,int right){
        int size=right-left+1;
        if(size<=3)
            manualSort(left,right);
        else {
            int mid=midOfThree(left,right);
            int partition=doPartition2(left,right,mid);
            recursionQuickSort2(left,partition-1);
            recursionQuickSort2(partition+1,right);
        }
    }
    public static void main(String[] args) {
        int maxSize2=15;
        ArrayQuickSort2 aqs2=new ArrayQuickSort2(maxSize2);
        for (int i = 0; i < maxSize2 ; i++) {
            aqs2.insert((int)(java.lang.Math.random()*199));
        }
        aqs2.display();
        aqs2.quickSort2();
        aqs2.display();
    }
}

package DataStructure.SimpleSort;

/**
 * Created by FY on 16/12/20.
 */
public class ArrayTest2 {

    private int elementsCount;
    private int arr[];

    public ArrayTest2(int a){
        arr=new int[a];
        elementsCount=0;

    }

    public void find(int searchKey){
        int i;
        int j = 0;
        for (i = 0; i <elementsCount; i++) {
            if (arr[i] == searchKey){
                j = i;
                break;
            }
        }
        if(elementsCount== i)
            System.out.println("Not found");
        else
            System.out.println("Found:"+"arr["+j+"]="+arr[j]);
    }

    public void insert(int value){
        arr[elementsCount++]=value;
    }

    public void delete(int value){
        int i;
        for (i = 0; i <elementsCount; i++) {
            if(value==arr[i])
                break;
        }
        if(elementsCount==i)
            System.out.println("Not existed");
        else{
            for(int j=i;j<elementsCount;j++)
                arr[j]=arr[j+1];
            elementsCount--;

        }
    }

    public void display(){
        for (int i = 0; i <elementsCount ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int getMax(){
        int max=arr[0];
        for (int i = 1; i <elementsCount ; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

    public int getMin(){
        int min=arr[0];
        for (int i = 1; i <elementsCount ; i++) {
            if(min>arr[i])
                min=arr[i];
        }
        return min;
    }

    public void swap(int indexA,int indexB){
        int temp=arr[indexA];
        arr[indexA]=arr[indexB];
        arr[indexB]=temp;
    }

    public void deleteRepeat(){
        int temp;
        for (int q = 0; q <elementsCount ; q++) {
            temp=arr[q];
            for (int k = q+1; k <elementsCount ; k++) {
                if(temp==arr[k]) {
                    delete(arr[k]);
                }
            }
        }
    }

    public void bubbleSort(){
        int out;
        int in;
        for (out = elementsCount; out >1 ; out--) {
            for (in=0;in<out;in++){
                if (arr[in]<arr[in+1])
                    swap(in,in+1);
            }
        }
    }   //降序

    public void selectSort(){
        int out;
        int min;
        int in;
        for(out=0;out<elementsCount;out++){
            min=out;
            for (in = 0; in <out ; in++) {
                if(arr[in]<arr[min])
                    min=in;
                swap(out,min);
            }
        }
    }  //降序

    public void insertionSort(){
        int in;
        int out;
        for (out = 1; out < elementsCount; out++) {
            in=out;
            int temp=arr[in];
            while(in>0&&temp<=arr[in-1]){
                arr[in]=arr[in-1];
                --in;
            }
            arr[in]=temp;
        }
    }  //升序

    public void binarySearch(long searchKey){
        int lowerBound=0;
        int upperBound=elementsCount-1;
        int curIn;
        while(true){
            curIn=(upperBound+lowerBound)/2;
            if(arr[curIn]==searchKey){
                System.out.println("Found:"+"arr["+curIn+"]="+arr[curIn]);
                break;
            } else if(upperBound<lowerBound){
                System.out.println("Not found");
                break;
            } else{
                if(arr[curIn]<searchKey)
                    upperBound=curIn-1;
                else
                    lowerBound=curIn+1;
            }

        }

    }  //仅适用于降序排列的数组



    public static void main(String[] args) {

        ArrayTest2 test=new ArrayTest2(20);

        test.insert(4);
        test.insert(5);
        test.insert(3);
        test.insert(8);
        test.insert(7);
        test.insert(9);
        test.insert(1);
        test.insert(2);
        test.insert(6);
        test.display();

        test.find(5);
        test.find(10);

        test.insertionSort();
        test.display();
        test.selectSort();
        test.display();
        test.bubbleSort();
        test.display();

        test.insert(2);
        test.display();
        test.delete(2);
        test.display();

        test.swap(0,1);
        test.display();

        test.insert(3);
        test.insert(9);
        test.display();
        test.deleteRepeat();
        test.display();

        System.out.println("Max value is "+test.getMax());


        test.bubbleSort();
        test.display();
        test.binarySearch(5);
        test.binarySearch(6);
        test.binarySearch(7);
        test.binarySearch(3);
        test.binarySearch(9);

    }

}

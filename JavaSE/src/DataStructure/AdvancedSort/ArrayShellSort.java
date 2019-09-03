package DataStructure.AdvancedSort;

/**
 * Created by FY on 17/2/20.
 */
public class ArrayShellSort {
    private int elementCount;
    private int arr[];
    public ArrayShellSort(int max){
        arr=new int[max];
        elementCount=0;
    }
    public void insert(int value){
        arr[elementCount++]=value;
    }
    public void display(){
        for (int i=0;i<elementCount;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void shellSort(){
        int outer;
        int inner;
        int temp;
        int h=1;
        while(h<=elementCount/3){
            h=h*3+1;
        }
        System.out.println("h="+h);
        while(h>0){
            for(outer=h;outer<elementCount;outer++){
                temp=arr[outer];
                inner=outer;
                while ((inner>h-1)&&arr[inner-h]>=temp){
                    arr[inner]=arr[inner-h];
                    inner-=h;
                }
                arr[inner]=temp;
            }
            h=(h-1)/3;
        }
    }

    public static void main(String[] args) {
        int maxsize=100;
        ArrayShellSort as=new ArrayShellSort(maxsize);
        for (int j=0;j<maxsize;j++){
            int n=(int)(java.lang.Math.random()*99);
            as.insert(n);
        }
        as.display();
        as.shellSort();
        as.display();
    }
}

package DataStructure.AdvancedSort;

/**
 * Created by FY on 2017/6/5.
 */
public class ArrayMergeSort {
    public static void main(String[] args) {
        int[] arrA={23,31,42,56};
        int[] arrB={8,25,27,35,46,88};
        int[] arrC=new int[10];
        merge(arrA,4,arrB,6,arrC);
        display(arrC);
    }

    public static void merge(int[] arrA,int sizeA,int[] arrB,int sizeB,int[] arrC){
        int indexA=0;
        int indexB=0;
        int indexC=0;
        while (indexA<sizeA&&indexB<sizeB){
            if(arrA[indexA]<arrB[indexB])
                arrC[indexC++]=arrA[indexA++];
            else
                arrC[indexC++]=arrB[indexB++];
        }
        while (indexA<sizeA)
            arrC[indexC++]=arrA[indexA++];
        while (indexB<sizeB)
            arrC[indexC++]=arrB[indexB++];
    }

    public static void display(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

package DataStructure.SimpleSort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []array={50,40,20,45,15,70,33};
        for(int i=1;i<array.length;i++) {
            if(array[i]<array[i-1]){
                int temp=array[i];
                int k = i - 1;
                for(int j=k;j>=0 && temp<array[j];j--) {
                    array[j+1]=array[j];
                    k--;
                }
                array[k+1]=temp;
            }
        } 
        for(int l:array){
        	System.out.println(l+" ");
        }
	}

}

package DataStructure.SimpleSort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{64,23,94,42,54,61,97,46};
		for(int i=0;i<(arr.length)-1;i++){
			for(int j=0;j<(arr.length)-i-1;j++){
				if(arr[j+1]>arr[j]){
				    int temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}    
			}
		}
		
		for(int k:arr){
			System.out.print(k+" ");
		}
	}

}

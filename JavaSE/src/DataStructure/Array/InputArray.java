package DataStructure.Array;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
        	arr[i]=s.nextInt();
        }
        s.close();
        for(int j=0;j<arr.length;j++){
        	System.out.println(arr[j]);
        }
        for(int k:arr){
        	System.out.println(k);
        }
	}

}

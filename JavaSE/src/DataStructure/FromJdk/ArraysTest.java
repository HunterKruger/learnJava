package DataStructure.FromJdk;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{34,52,16,124,24};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, 0, 3);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 0);
		System.out.println(Arrays.toString(arr));
		
		int arr2[]=new int[]{12,51,54,32,63,13,63,95,28};
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.binarySearch(arr2, 95));
		System.out.println(Arrays.hashCode(arr2));
	
		
	}

}

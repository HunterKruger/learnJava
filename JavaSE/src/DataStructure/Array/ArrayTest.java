package DataStructure.Array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
        	arr[i]=(int)(Math.random()*100);
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        
        int arr2[]=new int[]{1,2,3,4,5,6};
        for(int i=0;i<arr2.length;i++){
        	System.out.print(arr2[i]+" ");
        }
        
        System.out.println();
        
        int arr3[][]=new int[3][4];
        for(int i=0;i<arr3.length;i++){
        	for(int j=0;j<arr3[0].length;j++){
        		arr3[i][j]=(int)(Math.random()*100);
        		System.out.print(arr3[i][j]+" ");
        	}
        	System.out.println();
        }
        
        int arr4[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for(int i=0;i<arr4.length;i++){
        	for(int j=0;j<arr4[0].length;j++){ 		
        		System.out.print(arr4[i][j]+" ");
        	}
        	System.out.println();
        }
        
        
        
        
	}

}

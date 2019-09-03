package Leetcode;

/**
 * Created by FY on 2017/6/23.
 */
public class TwoNumber {

    public static int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int[] a=new int[2];
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(nums[i]+nums[j]==target){
                    a[0]=i;a[1]=j;

                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,5};
        int[] ans=twoSum(nums,9);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }


}

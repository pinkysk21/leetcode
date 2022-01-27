package Leetcode;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1,2,1,-4};
		int target = 1;
		System.out.println(new ThreeSumClosest().threeSumClosest(nums,target));

	}
	
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                int value=nums[i]+nums[low]+nums[high];
                if(value>target)
                    high--;
                else
                    low++;
                if(Math.abs(value-target)<Math.abs(sum-target)){
                    sum=value;
                }
            }
        }
        return sum;
     }

}

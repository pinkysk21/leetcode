package Leetcode;

public class InsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
                return mid;
            if(target>nums[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return left;
        
    }
}
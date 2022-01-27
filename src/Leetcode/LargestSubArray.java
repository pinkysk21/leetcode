package Leetcode;

public class LargestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LargestSubArray lb=new LargestSubArray();
			int val=lb.maxSubArray(new int[] {-1,-1,-2,-2});
			System.out.println(val);
	}
	
	public int maxSubArray(int[] nums) {
		 
        int sum=nums[0];
        int largest=nums[0];
        for(int i=1;i<nums.length;i++){
            int previous=sum;
            sum+=nums[i];
            if(nums[i]>sum){
                //  largest=nums[i];
                  sum=nums[i];
              }
              if(nums[i]>largest){
                  largest=nums[i];
              }
           
            if(previous>largest){
                largest=previous;
            }
           
            
        }
        
        if(largest<sum){
            return sum;
        }
        return largest;
    }

}

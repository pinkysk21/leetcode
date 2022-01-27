package Leetcode;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4};
		int val=3;
		for(int i:nums) {
			if(Integer.compare(val,i)==0) {
				System.out.println("Found");
			}
		}

	}

}

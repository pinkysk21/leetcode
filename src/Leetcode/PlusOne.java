package Leetcode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionA sol=new SolutionA();
		int a[]=new int[] {9,9};
		System.out.println(Arrays.toString(sol.plusOne(a)));
	}

}

class SolutionA {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
     int val=digits[length-1];
        val++;
        if(val>9){
            
           for(int i=length-1;i>=0;i--){
               if((digits[i]+1)>9){
                   digits[i]=0;
               }
               else{
                   ++digits[i];
                   return digits;
               }
               
            
        }
          
                digits=new int[length+1];
                digits[0]=1;
            return digits;
            
        }
        else{
            digits[length-1]=val;
            return digits;
        }
    }
}
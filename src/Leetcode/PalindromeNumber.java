package Leetcode;

public class PalindromeNumber {
	
	 public int reverse(int x) {
	        int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	    }
	 
	 public int reverseMine(int x) {
	       int reverse =0;
	        int y=Math.abs(x);
	        while(y%10==0){
	            y=y/10;
	        }
	        if(y==0){
	            return y;
	        }
	        while(y>0){
	            reverse=reverse*10+(y%10);
	            y=y/10;
	        }
	        if(x<0){
	            reverse=~(reverse-1);
	        }
	        return reverse;
	 }    
	

	public static void main(String args[]) {
		Boolean res=new Solution().isPalindrome(121);
		System.out.print(res);
	}
}
class Solution {
    public boolean isPalindrome(int x) {
        String y=Integer.toString(x);
        for(int i=0;i<y.length()/2;i++){
            int a=x%10;
            char v=(char)(a+'0');
            x=x/10;
            if(v!=y.charAt(i)) {
            	return false;
            }
            
        }
           return true;
       
    }
    
    
    
    public boolean find(int x) {
    	   if(x < 0 || (x % 10 == 0 && x != 0)) {
               return false;
           }

           int revertedNumber = 0;
           while(x > revertedNumber) {
               revertedNumber = revertedNumber * 10 + x % 10;
               x /= 10;
           }

           // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
           // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
           // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
           return x == revertedNumber || x == revertedNumber/10;
    }
}
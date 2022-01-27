package Leetcode;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(new Solution1().reverse(-2147483412));
	}

}
class Solution1 {
    public int reverse(int x) {
    	if(x==0) {
    		return x;
    	}
    	while(x%10==0) {
    		x=x/10;
    	}
    	int reverse=0;
    	int y=Math.abs(x);
    	while(y>0) {
    		reverse =reverse*10+(y%10);
    		
    		y=y/10;
    		if(y>0&&reverse>(Integer.MAX_VALUE/10)) {
    			
    			return 0;
    		}
    		else if(y>0&&reverse==Integer.MAX_VALUE/10) {
    				if(x<0) {
    					if(y==8) {
    						return Integer.MIN_VALUE;
    					}
    					else if(y>8)
    						return 0;
    				}
    				else if(y>7) {
    					return 0;
    				}
    			}
    	}
    	if(x<0) {
    		reverse=reverse*-1;
    		
    	}
    	return reverse;
        
    }
    
    //leetcode
    public int reverse1(int x) {
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
}
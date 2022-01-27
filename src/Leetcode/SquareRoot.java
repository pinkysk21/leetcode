package Leetcode;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SquareRoot sq=new SquareRoot();
System.out.println(sq.mySqrt(2147395599));
	}

	
public int mySqrt(int x) {
	if(x<2) {
		return x;
	}
        int i=2;
        int j=x/2;
         while(i<=j) {
        int mid=i+(j-i)/2;
        long value=(long)mid*mid;
        if(value==x) {
        	return mid;
        }
        else if(value<x) {
        	i=mid+1;
        }
        else
        {
        	j=mid-1;
        }
        }
        return j;
        
    }
}

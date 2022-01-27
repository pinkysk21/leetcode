package Leetcode;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LongestPrefix lp=new LongestPrefix();
String[] strs= {"flower","flow","flight"};
System.out.println(lp.longestCommonPrefix(strs));
	}
	
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length==0) {
			 return "";
		 }
	        String value=strs[0];
	        for(int i=1;i<strs.length;i++) {
	        	while(strs[i].indexOf(value)!=0) {
	        		value=value.substring(0, value.length()-1);
	        	}
	        }
	        return value;
	        
	    }
}

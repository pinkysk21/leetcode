package Leetcode;

public class PalindromeLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution{
	public String longest(String s) {
		int start=0;
		int end=0;
		if(s==null||s.length()<1) {
			return "";
		}
		for(int i=0;i<s.length();i++) {
			int len1=find(s,i,i);
			int len2=find(s,i,i+1);
			int max=Math.max(len1, len2);
			if(max>start-end) {
				start=i-(max-1)/2;
				end=i+(max)/2;
			}
			
		}
		return s.substring(start, end+1);
	}
	
	public int find(String s, int left,int right)
	{
		if(s==null||left>right) {
			return 0;
		}
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}
	
}

package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoDupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestSubstringNoDupli().lengthOfLongestSubstring("abba"));
	}
	 public int lengthOfLongestSubstring(String s) {
		 int length=0;
		 Map<Character,Integer> map=new HashMap<Character,Integer>();
		 for(int i=0,j=0;i<s.length();i++) {
			 if(map.containsKey(s.charAt(i))) {
				 j=Math.max(map.get(s.charAt(i)),j);
				// j++;
				 
			 }
			 map.put(s.charAt(i), i+1);
			 length=Math.max(length, i-j+1);
		 }
		 return length;
	        
	 }
}

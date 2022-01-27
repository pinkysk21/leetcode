package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static String longest="";
    static int length=0;
    public String longestPalindrome(String s) {
        if(s.length()==1||s==null) {
			longest= s;
		}
		else
		{
			Map<Character,List<Integer>> map=new HashMap<>();
			for (int i=0;i<s.length();i++) {
				
				
				if(map.containsKey(s.charAt(i))) {
					map.get(s.charAt(i)).add(i);
					
					
				}
				else {
					List<Integer> list=new ArrayList<>();
					list.add(i);
					map.put(s.charAt(i),list);
				}
			}
			//int length=0;
			
			for(Character key:map.keySet()) {
				List<Integer> l=map.get(key);
				if(l.size()>1) {
					for(Integer i:l) {
						Integer last=l.size()-1;
						for(int k=last;k>l.indexOf(i);k--) {
						Boolean value=checkIfPalindrome(s,i,l.get(k));
						if(value==true) {
							break;
						}
						}
					}
					
				}
			}
		}
		
        return longest;
    }
    
    public static boolean checkIfPalindrome(String val,int a,int b) {
		if((b-a)<length) {
		return true;
	}
		else {
			int v=0;
			for(int i=a,k=b;i<=(a+(b-a)/2);i++,k--) {
				if(val.charAt(i)==val.charAt(k)) {
					v=1;
					
				}
				else {
					v=0;
					return false;
				}
			}
			if(v==1) {
				if(length<b-a+1) {
				length=b-a+1;
				longest=val.substring(a, b+1);
				}
			}
			return true;
		}

}
}
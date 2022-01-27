package Leetcode;

import java.util.HashMap;
import java.util.*;

public class LongestPalindrome {
	static int length=0;
//	 String longest="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LongestPalindrome lPalindrome=new LongestPalindrome();
String longest=lPalindrome.find("babadada");
System.out.println(longest+" "+length);

	}
	
	public String find(String a) {
		String longest="";
		int length=0;
		
		
		if(a.length()==1||a==null) {
			longest= a;
		}
		else
		{
			Map<Character,List<Integer>> map=new LinkedHashMap<>();
			for (int i=0;i<a.length();i++) {
				
				
				if(map.containsKey(a.charAt(i))) {
					map.get(a.charAt(i)).add(i);
					
					
				}
				else {
					List<Integer> list=new ArrayList<>();
					list.add(i);
					map.put(a.charAt(i),list);
				}
			}
			//int length=0;
			
			for(Character key:map.keySet()) {
				List<Integer> l=map.get(key);
				String value="";
				if(l.size()>1) {
					for(Integer i:l) {
						if(length>=(l.get(l.size()-1)-i+1)) {
							break;
						}
						Integer last=l.size()-1;
						for(int k=last;k>l.indexOf(i);k--) {
							
							value=checkIfPalindrome(a,i,l.get(k),length);
							if(value!=null) {
									length=value.length();
									longest=value;
								break;
							}
						}
						
					}
					
				}
				else {
					String newValue=a.substring(l.get(0), l.get(0)+1);
					if(length==0) {
						length=1;
						longest=newValue;
					}
				}
			}
		}
		
		return longest;
	}
	
	public static String checkIfPalindrome(String val,int a,int b,int length) {
		
		if((b-a+1)<length) {
		return null;
	}
		else {
			int v=0;
			for(int i=a,k=b;i<=(a+(b-a)/2);i++,k--) {
				if(val.charAt(i)==val.charAt(k)) {
					v=1;
					
				}
				else {
					v=0;
					return null;
				}
			}
			if(v==1) 
				return val.substring(a, b+1);
				
			
			//return true;
		}
		return val;

}
}

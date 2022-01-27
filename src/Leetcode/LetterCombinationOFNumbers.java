package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class LetterCombinationOFNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution2().letterCombinations("234"));
	}

}
class Solution2 {
	 List<String> values=new ArrayList<>();
     HashMap<Integer,List<String>> map=new HashMap<>() {  {
     put(2, Arrays.asList("a","b","c"));
     put(3, Arrays.asList("d","e","f"));
     put(4, Arrays.asList("g","h","i"));
     put(5, Arrays.asList("j","k","l"));
     put(6, Arrays.asList("m","n","o"));
     put(7, Arrays.asList("p","q","r","s"));
     put(8, Arrays.asList("t","u","v"));
     put(9, Arrays.asList("w","x","y","z"));
     }};
    public List<String> letterCombinations(String digits) {
       
        List<List<String>> listOfValues=new ArrayList<>();
        
        for(int i=0;i<digits.length();i++) {
        	if(digits.charAt(i)>'1'&&digits.charAt(i)<='9') {
        		List<String> list=new ArrayList<>();
        		list=map.get(digits.charAt(i)-'0');
        		if(digits.length()==1)
        			return list;
        		else
        			listOfValues.add(list);        		
        	}
        }
        	List<String> tempList=new ArrayList<>();
        	for(int i=0;i<listOfValues.size();i++) {
			/*
			 * List<String> l=listOfValues.get(i);
			 * 
			 * for(int j=i+1;j<listOfValues.size();j++) { List<String>
			 * q=listOfValues.get(j); for(String a:l) { for(String b:q) { values.add(a+b); }
			 * } }
			 */
        		List<String> l=listOfValues.get(i);
        		if(tempList.isEmpty()) {
        			for(String l1:l) {
        				tempList.add(l1);
        			}
        		}
        			else {
        				int size=tempList.size();
        				while(size>0){
        					for(int j=0;j<l.size();j++) {
        						tempList.add(tempList.get(0)+l.get(j));
        						
        					}
        					tempList.remove(0);
        					size--;
        				}
        				
        			}
        		}
        		
        		
        		
        	
        
      
        return tempList;
    }
}	


//leetcode

class Solution {
public List letterCombinations(String digits) {

    List<String> ans = new ArrayList<String>();
    if(digits==null||digits.length()==0) return ans;
    char[][] map = new char[8][];
    map[0]="abc".toCharArray();
    map[1]="def".toCharArray();
    map[2]="ghi".toCharArray();
    map[3]="jkl".toCharArray();
    map[4]="mno".toCharArray();
    map[5]="pqrs".toCharArray();
    map[6]="tuv".toCharArray();
    map[7]="wxyz".toCharArray();
    
    char[] input = digits.toCharArray();
    ans.add("");
    for(char c:input)
        ans=expand(ans,map[c-'2']);
    return ans;
    
    
}

private List<String> expand(List<String> l,char[] arr)
{
    List<String> next = new ArrayList<String>();
    for(String s:l)
        for(char c:arr)
            next.add(s+c);
    return next;
}
}
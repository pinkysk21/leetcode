package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String strs[]= {"eat","tea","tan","ate","nat","bat"};
System.out.println(new Anagram().groupAnagrams(strs));
	}

	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char a[]=strs[i].toCharArray();
            Arrays.sort(a);
            String val=String.valueOf(a);
            if(!map.containsKey(val)) {
            	List<String> ar=new ArrayList<>();
            	ar.add(strs[i]);
            	map.put(val, ar);
            }
            else {
            	map.get(val).add(strs[i]);
            }
        }
        list.addAll(map.values());
        return list;
        
    }
}

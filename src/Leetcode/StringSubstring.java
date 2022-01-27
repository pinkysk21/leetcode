package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new StringSubstring().lengthOfLongestSubstring("ohomm");
		new StringSubstring().newlengthOfLongestSubstring("pwwkew");
		new StringSubstring().newlengthOfLongestSubstring("tmmzuxt");
		new StringSubstring().newlengthOfLongestSubstring("dvdf");
	}

	public void lengthOfLongestSubstring(String s) {
		TreeSet<Integer> set = new TreeSet<>();
		ArrayList<Character> l = new ArrayList<>();
		if (s == null)
			return;
		for (int i = 0; i < s.length(); i++) {
			if (!l.contains(s.charAt(i)))
				l.add(s.charAt(i));
			else {
				set.add(l.size());
				l.subList(0, l.indexOf(s.charAt(i)) + 1).clear();
				l.add(s.charAt(i));
			}
		}
		set.add(l.size());
		System.out.println(set.last());
	}

	public void newlengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int start = 0;
		int maxlength = 0;
		int currentlength = 0;
		if (s == null)
			return;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int prevIndex = map.get(s.charAt(i));
				if (start <= prevIndex) {
					currentlength = i - start;
					if (currentlength > maxlength)
						maxlength = currentlength;
					start = prevIndex+1;
					map.replace(s.charAt(i), i);
				} else {
					map.put(s.charAt(i), i);
					//start--;
				}
			} else {
				map.put(s.charAt(i), i);
			}
		}
		currentlength = s.length() - start;
		if (currentlength > maxlength)
			maxlength = currentlength;
		System.out.println(maxlength);
	}
}

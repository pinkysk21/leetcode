package Leetcode;

public class FindCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(new FindCommonSubstring().longestCommonString1("abcxpqrs","abypqrs"));

	}
	
	public int longestCommonString1(String s1, String s2) {
		
		int len=0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length();j++) {
				if (s2.contains(s1.substring(i, j))) {
					int subStringlength = j - i;
					if (len < subStringlength) {
						len = subStringlength;

					}

				}
			}
		}
		return len;
	}

}

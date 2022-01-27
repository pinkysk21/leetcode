package Leetcode;

public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementstrStr imp=new ImplementstrStr();
		int k=imp.strStr("mississippi",
				"issipi");
		System.out.println(k
				);
	}
	
	
	public int strStr(String haystack, String needle) {

		if (haystack.isEmpty() && needle.isEmpty() || needle.isEmpty())
			return 0;
		int length1 = needle.length();
		char[] needle1 = needle.toCharArray();
		int length = haystack.length();

		for (int i = 0; i <= length-length1; i++) {
			if (haystack.charAt(i) == needle1[0]) {
				var found = false;
				for (int j = 1; j < length1; j++) {
					if(haystack.charAt(i+j) != needle1[j])
					{
						break;
					}
					if(j == length1-1)
						found = true;
				}
				if(found)
				{
					return i;
				}
			}
		}
		return -1;
	}
	

}

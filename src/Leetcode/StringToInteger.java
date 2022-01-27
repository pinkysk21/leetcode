package Leetcode;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new StringToInteger().aToi("    -512"));
	}

	
	public int aToi(String s) {
		 int result=0;
			if(s==null) {
				return result;
			}
			else {
				int sign=1;
				int j=0;
				while(j<s.length()&&s.charAt(j)==' ') {
					j++;
				}
				if(j<s.length()&&s.charAt(j)=='-')
				{
					sign=-1;
					j++;
				}
	            else if(j<s.length()&&s.charAt(j)=='+')
				{
					sign=1;
					j++;
				}
				
				for(int i=j;i<s.length();i++) {
					if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
						if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&s.charAt(i)>'7')) {
							if(sign==-1) {
								return Integer.MIN_VALUE;
							}
							return Integer.MAX_VALUE;
						}
						result=result*10+Character.getNumericValue(s.charAt(i));
						
					}
					else {
						return result*sign;
					}
					
					
				}
				return sign*result;
			}
	    }
		
	}


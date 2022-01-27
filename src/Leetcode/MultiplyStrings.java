package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MultiplyStrings().multiply("45","823"));
		System.out.println(new MultiplyStrings().multiply1("45","823"));
	}
	
	 public String multiply(String num1, String num2) {
	    //  int length=Math.max(num1.length(), num2.length());
		 if(num1.equals("0")||num2.equals("0")){
	            return "0";
	        }
		 String ch="0";
		 int length1=num1.length();
		 int length2=num2.length();
		 if(num1.length()>num2.length()) {
			num2= ch.repeat(length1-length2)+num2;
		 }
		 else if(length1<length2)
		 {
			 num1=ch.repeat(length2-length1)+num1;
		 }
		 int length = num1.length();
		 String res="";
		 List<String> list=new ArrayList<>();
	      for(int i=length-1,k=0;i>=0;i--,k++) {
	    	  int carry=0;
	    	  String c="";
	    	  for(int j=length-1;j>=0;j--) {
	    		  int value = carry + Character.getNumericValue(num1.charAt(i))*Character.getNumericValue(num2.charAt(j));
	    		  carry = value/10;
	    		  c= value%10 + c;
	    	  }
	    	  if(carry!=0)
	    	    c=carry+c;
	    	  c=c+ch.repeat(k);
	    	  list.add(c);
	    	 
	      }
	      
	      int carry1=0;
    	  
	      for(int i=0;i<list.get(list.size()-1).length();i++)
	      {
	    	  int temp = carry1;  
	    	  for(String v:list) {
	    		  int index = v.length()-1-i;
	    		  if(index>=0)
	    		  {
	    			  temp = temp + Character.getNumericValue(v.charAt(index));
	    		  }
	    	  }
	    	  
	    	  carry1 = temp/10;
	    	  res=(temp%10) + res;
	      }
	      if(carry1!=0)
	    	  res=carry1 + res;
	      
	      int l=0;
          while(res.charAt(l)=='0')
          {
              l++;
          }
	      return res.substring(l,res.length()); 
	    }

	 
	 
	 //leetcode
	 
	 public String multiply1(String num1,String num2) {
		 int length1=num1.length();
		 int length2=num2.length();
		 int[] val=new int[length1+length2];
		 for(int j=length2-1;j>=0;j--) {
			 for(int i=length1-1;i>=0;i--) {
				 int result=val[i+j+1]+((num1.charAt(i)-'0')*(num2.charAt(j)-'0'));
				 val[i+j]=val[i+j]+result/10;
				 val[i+j+1]=result%10;
			 }
		 }
		 
		 StringBuilder sb=new StringBuilder();
		 for(int value:val) {
			 if(sb.length()!=0||value!=0) {
				 sb.append(value);
			 }
		 }
		 return sb.toString();
	 }
}

package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class ListNode11{
	     int val;
	     ListNode11 next;
	     ListNode11() {}
	     ListNode11(int val) { this.val = val; }
	     ListNode11(int val, ListNode11 next) { this.val = val; this.next = next; }
	 }
	 
	class Solution4 {
	    public ListNode11 removeNthFromEnd(ListNode11 head, int n) {
	        if(head==null){
	            return null;
	        }
	        else{
	            ListNode11 current=head;
	            Map<Integer,Integer> map=new HashMap<>();
	            int i=1;
	            while(current!=null){
	                map.put(i,current.val);
	                current=current.next;
	                i++;
	            }
	            
	            int value=i-n;
	            
	            ListNode11 currentNew=head;
	            ListNode11 next=null;
	            ListNode11 previous=head;
	            int j=1;
	            while(currentNew!=null)
	            {
	                if(j==value){
	                    
	                        if(currentNew==head){
	                        head=head.next;
	                            break;
	                        }
	                    
	                    previous.next=currentNew.next;
	                    break;
	                }
	                previous=currentNew;
	                currentNew=currentNew.next;
	                j++;
	            }
	            return head;
	        }
	    }
	}
	
	
	
	class Solution {
	    public ListNode11 removeNthFromEnd(ListNode11 head, int n) {
	         Map<Integer,ListNode11> map=new HashMap<>();
	        if(head==null){
	            return null;
	        }
	        else{
	            ListNode11 current=head;
	           
	            int i=1;
	            while(current!=null){
	                map.put(i,current);
	                current=current.next;
	                i++;
	            }
	            int m=0;
	           
	            int value=i-n;
	            if(value<i){
	            ListNode11 currentNew=map.get(value);
	            ListNode11 next=null;
	            if(currentNew==head&&i>1){
	            	 if(i!=2)
	                     head=map.get(value+1);
	                     else
	                         head=null;
	            //    head=map.get(value+1);
	            }
	            else{
	            ListNode11 previous=map.get(value-1);
	                previous.next=currentNew.next;
	                
	            }
	            }
	            return head;
	        }
	    }
	    
	    
	    
	  //leetcode
		
		public ListNode1 removeNthFromEnd(ListNode1 head, int n) {
	        
		       ListNode1 first=new ListNode1(0);
		        first.next=head;
		        ListNode1 second=first;
		        ListNode1 third=first;
		       for(int i=1;i<=n+1;i++){
		           if(first!=null)
		           first=first.next;
		       }
		        while(first!=null){
		            first=first.next;
		            second=second.next;
		        }
		        second.next=second.next.next;
		        return third.next;
		    }
	}
	
	
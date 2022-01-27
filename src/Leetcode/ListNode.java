package Leetcode;

public class ListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode1 l=new ListNode1(1);
		
	}

}
 class ListNode1 {
	     int val;
	     ListNode1 next;
	     ListNode1() {}
	     ListNode1(int val) { this.val = val; }
	     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
	 }
	
	class Solution5 {
	    public ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {

	        if(l1==null||l2==null){
	            if(l1==null)
	                return l2;
	            else
	                 return l1;
	        }
	        else{
	            ListNode1 l3=null;
	            ListNode1 l4=null;
	            while(l1!=null&l2!=null){
	                int val1=l1.val;
	                int val2=l2.val;
	                if(val1<val2){
	                    if(l3==null){
	                        l3=new ListNode1(val1);
	                        l4=l3;
	                        l1=l1.next;
	                    }
	                    else{
	                        l3.next=l1;
	                        l3=l3.next;
	                        l1=l1.next;
	                    }
	                }
	                else{
	                    if(l3==null){
	                        l3=new ListNode1(val2);
	                        l4=l3;
	                        l2=l2.next;
	                    }
	                    else{
	                        l3.next=l2;
	                        l3=l3.next;
	                        l2=l2.next;
	                    }
	                }
	            
	            }
	            if(l1!=null)
	                l3.next=l1;
	            else if(l2!=null)
	                l3.next=l2;
	            
	            return l4;
	        }
	    }
	}
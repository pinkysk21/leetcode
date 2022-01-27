package Leetcode;

public class RemoveDuplicateFromListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

  class ListNode12 {
      int val;
     ListNode12 next;
     ListNode12() {}
     ListNode12(int val) { this.val = val; }
     ListNode12(int val, ListNode12 next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode12 deleteDuplicates(ListNode12 head) {
        ListNode12 current=head;
        ListNode12 next=null;
        if(head==null||head.next==null){
            return head;
        }
        else{
            next=head.next;
        }
        while(current.next!=null){
            if(head.val==next.val){
                head=next;
                current=head;
                next=next.next;
                continue;
            }
           else if(current.val==next.val){
                current.next=next.next;
               next=next.next;
               continue;
            }
            if(current.next!=null||next!=null){
            current=current.next;
            next=next.next;
            }
            
            
        }
        
        return head;
    }
    
    //..leetcode
    public ListNode12 deleteDuplicates1(ListNode12 head) {
        ListNode12 current = head;
        if(current!=null&&current.next!=null) {
        	if(current.next.val==current.val) {
        		current.next=current.next.next;
        	}
        	else {
        		current=current.next;
        	}
        }
        return head;
    }
}



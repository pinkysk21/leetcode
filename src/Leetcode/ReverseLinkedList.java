package Leetcode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous=null;
        ListNode nextNode=null;
        while(head!=null){
            nextNode=head.next;
            head.next=previous;
            previous=head;
            head=nextNode;
            
        }
        return previous;
    }
}
package Leetcode;

public class AddLinkedList {

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int carryvalue=0;
        ListNode l3=null;
        ListNode l4=null;
        while(l1!=null||l2!=null){
            int value1=(l1==null)?0:l1.val;
            int value2=(l2==null)?0:l2.val;
           int sum=(value1+value2+carryvalue)%10;
            carryvalue=(value1+value2+carryvalue)/10;
            if(l3==null){
                l3=new ListNode(sum);
                l4=l3;
            }
             else
             { l3.next=new ListNode(sum);
              l3=l3.next;
             }
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
            
            }
        if(carryvalue>0){
            l3.next=new ListNode(carryvalue);
        
        }
        return l4;
    }
}

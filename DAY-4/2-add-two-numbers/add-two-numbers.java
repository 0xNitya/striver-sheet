/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
        // dummy bana,l1 l2 iterate kar carry me dono add krke %10 kr, fir /10 

        while(l1!=null || l2!=null || carry>0)
        {
            if(l1!=null){carry+=l1.val;l1=l1.next;}
            if(l2!=null){carry+=l2.val;l2=l2.next;}

            curr.next=new ListNode(carry%10);
            carry/=10;
            curr=curr.next;

        }
        return dummy.next;        
    }
}
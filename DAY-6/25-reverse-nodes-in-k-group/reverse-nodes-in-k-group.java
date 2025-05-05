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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){return head;}
        final int length=getlength(head);
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
        ListNode temp=head;
        for (int i = 0; i < length / k; ++i) {
            for (int j = 0; j < k - 1; ++j) {
                ListNode next = temp.next;
                temp.next = next.next;
                next.next = prev.next;
                prev.next = next;
      }
      prev = temp;
      temp = temp.next;
    }

        return dummy.next;
    }

    public int getlength(ListNode head)
    {
        int c=0;
        for(ListNode temp=head;temp!=null;temp=temp.next)
            ++c;
        return c;
    }
}
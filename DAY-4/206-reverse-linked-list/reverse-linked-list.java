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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        //1.
        // Stack<Integer> st=new Stack<>();
        // while(temp!=null)
        // {
        //     st.push(temp.val);
        //     temp=temp.next;
        // }
        // temp=head;
        // while(temp!=null)
        // {
        //     temp.val=st.pop();
        //     temp=temp.next;
        // }
        // return head;

        //2.

        ListNode prev=null;
        while(temp!=null)
        {
            ListNode front=temp.next;//2 3 4, 3 4
            temp.next=prev;//null,1->null
            prev=temp;//1->null,2->1->null,3->2->1->null,4-3-2-1-null
            temp=front;//2,3
        }
        return prev;
        
    }
}
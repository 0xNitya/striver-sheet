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
    public ListNode rotateRight(ListNode head, int k) {
    // iterate till k . fir circular krne ka hai end head ho jayega head end
        if (head == null || head.next == null) return head;
    //     for (int i = 0; i < k; i++) {
    //         ListNode temp = head;
    //         while (temp.next.next != null) temp = temp.next;
    //         ListNode end = temp.next;
    //         temp.next = null;
    //         end.next = head;
    //         head = end;
    // }
    // return head;



    //2.
    // length nikalna hai , fir circular krdena hai , nya k find krna hai using k=k%len
    //iterate 0 -> len-k break loop , head=tail.next tail.next=null

    int c=1;
    ListNode tail=head;
    while(tail.next!=null)
    {
        c++;
        tail=tail.next;
    }
    tail.next=head;
    k=k%c;

    for(int i=0;i<c-k;i++)
    {
        tail=tail.next;
    }

    head=tail.next;
    tail.next=null;

    return head;

    }
    
}
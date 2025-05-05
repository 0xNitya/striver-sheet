class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        // int count = 0;
        // ListNode temp = head;
        // while (temp != null) {
        //     count++;
        //     temp = temp.next;
        // }

        // int k = count / 2;
        // temp = head;
        // for (int i = 0; i < k - 1; i++) {
        //     temp = temp.next;
        // }

        // temp.next = temp.next.next;

        // return head;

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        prev.next=slow.next;
        return head;
    }
    
}

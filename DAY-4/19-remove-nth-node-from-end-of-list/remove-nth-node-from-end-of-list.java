class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        int count = 0;
        ListNode temp = head;

        // Count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // If removing the head
        if (count == n) {
            return head.next;
        }

        // Find the node before the one to remove
        int target = count - n;
        temp = head;
        for (int i = 1; i < target; i++) {
            temp = temp.next;
        }

        // Remove target node
        temp.next = temp.next.next;

        return head;
    }
}

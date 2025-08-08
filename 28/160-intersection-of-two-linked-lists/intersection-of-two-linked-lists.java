/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;

    while (a != b) {
    //   a = a == null ? headB : a.next;
      if(a==null)
      {
        a=headB;
      }
      else {a=a.next;}


    //   b = b == null ? headA : b.next;
      if(b==null)
      {
        b=headA;
      }
      else {b=b.next;}
    }

    return a;
  }
}
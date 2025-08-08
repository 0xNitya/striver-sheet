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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        // stack me bharna hai , fir end ko temp lena wapis reverse iterate . if temp.val==st.peek 
       // fir toh palindrome hai else nahi hai.
       Stack<Integer> st=new Stack<>();
       while(temp!=null)
       {
        st.push(temp.val);
        temp=temp.next;
       }

       temp=head;
       while(temp!=null)
       {
        if(temp.val!=st.peek()){return false;}
        st.pop();
        temp=temp.next;
       }
       return true;
        
    }
}
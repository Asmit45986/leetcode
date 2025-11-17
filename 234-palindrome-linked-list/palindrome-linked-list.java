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
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode temp = dummy;
        while(curr!=null){
            temp.next = new ListNode(curr.val);
            temp = temp.next;
            curr = curr.next;
        }
        ListNode prev = null;
        curr = head;
        while(curr!=null){
            ListNode newnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newnode;
        }
        ListNode rhead = prev;
        ListNode chead = dummy.next;
        while(rhead!=null && chead!=null){
            if(rhead.val != chead.val) return false;
            rhead = rhead.next;
            chead = chead.next;
        }
        return true;
    }          
}
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        
        if(n==1){
            head = head.next;
        }else{
            ListNode res = head;
            for (int i = 1; i < n -1; i++) {
            res = res.next;
            }
            res.next = res.next.next;
        }
        
        ListNode curr1 = head;
        ListNode prev1 = null;
        while (curr1 != null) {
            ListNode temp = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = temp;
        }
        return prev1;
    }
}
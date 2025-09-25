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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0;
        int countB = 0;
        ListNode temp = null;
        while(tempA != null){
            countA++;
            tempA = tempA.next;

        }
        while(tempB != null ){
            countB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(countA>countB){
            int a = countA - countB;
            for(int i = 0 ;i <a ; i++){
                tempA = tempA.next;
            }
        }else if(countB>countA){
            int b = countB - countA;
            for(int i = 0; i< b ; i++){
                tempB = tempB.next;
            }

        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;

        
    }
}
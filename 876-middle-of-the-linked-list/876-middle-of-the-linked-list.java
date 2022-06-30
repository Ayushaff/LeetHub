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
    public ListNode middleNode(ListNode head) {
         
        
        ListNode slw=head,fast = head;
        while(fast != null && fast.next != null){ //fast ==null out of boundary fast.next==null last node
            slw=slw.next;
            fast=fast.next.next;
        }
        return slw;
    }
}
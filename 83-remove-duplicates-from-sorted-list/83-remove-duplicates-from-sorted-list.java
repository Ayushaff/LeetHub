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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode curr=head;
        
        while(curr!=null){
            if(curr.next != null && (curr.val == curr.next.val)){
                curr.next=curr.next.next;
                /*ListNode next_next=curr.next.next;
                ListNode nodeTodlt=curr.next;
                //delete that node delete(nodeTodlt);
                curr.next=next_next;
                */
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
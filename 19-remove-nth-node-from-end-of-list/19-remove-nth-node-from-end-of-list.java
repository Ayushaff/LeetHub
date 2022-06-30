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
        
        /*For anyone wondering WHY this approach works. Here is a quick explanation:

When you move the fast pointer to nth node, the remaining nodes to traverse is (size_of_linked_list - n). After that, when you start moving slow pointer and fast pointer by 1 node each, it is guaranteed that slow pointer will cover a distance of (size_of_linked_list - n) nodes. And that's node we want to remove.
        
        TC =O(n)
        sc =O(1)    
        */
        
        //taking dummy node 
        ListNode start=new ListNode();
        start.next=head;
    ListNode slow=start;
    ListNode fast=start;
        
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
}
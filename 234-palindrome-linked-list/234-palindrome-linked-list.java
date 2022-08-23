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
        
     
    ListNode ptr=head;
        Stack<Integer>stk=new Stack<>();
        while(ptr!=null){
            stk.push(ptr.val);
            ptr=ptr.next;
            
        }
        ptr=head;
        
        while(ptr!=null){
            if(ptr.val!=stk.pop())return false;
            ptr=ptr.next;    
        }
        return true;
    }
}
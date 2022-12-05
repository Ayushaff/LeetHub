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
        // TC O(n/2) fast pointer covers the distance of 2
        //sc O(1)
        
        ListNode slw=head,fast = head;
        
        while(fast != null && fast.next != null){ 
            //if fast ==null (fast node is out of boundary,crossed the last node)if fast.next==null (fast is at last node)
            //if fast == null its even elements of case then return the second middle node caus of even case
            //if fast.next==null odd case 
            slw=slw.next;
            fast=fast.next.next;
        }
        return slw;
        
        //runtime exced 
      //  O(N) + O(N/2) , O(1)
//          ListNode dum;
//         dum = head;
//         int n = 0;
//         while (dum != null) {
//             n++;
//         }
//         int ans = n / 2;
//         int anss = ans + 1;
//         int count = 0;

//         while (head != null) {
//             if (count == anss)
//                 return dum;
//             count++;
//             dum = dum.next;
//         }
//         return dum;
        
    }
}
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
    //O(N ) O(1)
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next==null) return head;
        
        ListNode curr=head;         
        ListNode prev=null;
        
        while(curr!=null){
            
            ListNode tmp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tmp;
        }   
        //if(curr==null) System.out.println("asd"); 
        return prev; //is at last node became as a new head
    }
}
        /*
        if(head==null)return head;
        
        //ListNode curr=head;;
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev; //reverse
            prev=head;
            head=temp;
        }
        return prev;
        
    }
}
*/

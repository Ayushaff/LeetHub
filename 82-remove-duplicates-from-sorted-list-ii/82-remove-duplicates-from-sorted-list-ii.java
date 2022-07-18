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
        
        ListNode FakeHead=new ListNode(Integer.MIN_VALUE);        
        FakeHead.next=head;
        
        //pointer 1
        ListNode cur=head;
        //pointer 2
        ListNode pre=FakeHead;
        
         while(head!=null && head.next != null)
         {
             
             if(head.val == head.next.val)
             { //duplications
                 
                 while(head.next!=null && head.val == head.next.val)
                {
                     
                 head=head.next;
                    
                }
                pre.next=head.next;
             }
             else{
                 //not duplicate
                 pre=pre.next;
             }
             head=head.next;
         }
         return FakeHead.next;
     }
}    
   /*
        //2 pointers
        if(head==null) return null;
        
        ListNode FakeHead=new ListNode(0);        
        FakeHead.next=head;
        
        //pointer 1
        ListNode cur=head;
        //pointer 2
        ListNode pre=FakeHead;
        
        
        while(cur!=null && cur.next!=null){
            
            while(cur.val==cur.next.val){ //duplications
                cur=cur.next;
            }
            
            if(pre.next==cur){
                pre=pre.next;
            }
            
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }
        
}*/
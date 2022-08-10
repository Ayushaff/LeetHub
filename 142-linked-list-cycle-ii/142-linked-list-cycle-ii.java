/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution { 
     public ListNode detectCycle(ListNode head) {
         
         if(head == null || head.next == null)
             return null;
         
         //first check if its LL has loop or not
         ListNode s=head;
         ListNode f=head;
         ListNode entry=head;
         
         while(f.next!= null && f.next.next!=null){ //theres no cycle if fast is at null
             s=s.next;
             f=f.next.next;
             
             if(s==f){  //definitely its a cycle
                 while(s!=entry){
                     s=s.next;
                     entry=entry.next;
                 }
                 return entry; //or s
             }
                 
         }
         return null;
     }
}
        
          
   /* ListNode start_loop(ListNode p,ListNode head){ 
        
        ListNode q= head;
        
        while(p!=q){
            p=p.next;
            q=q.next;
        }
        
        return p;   //start loop returned
    }
    ListNode check_Loop(ListNode head){
        
        ListNode s=head;
        ListNode f=head;
        ListNode ans=null;
        
        while(f.next!= null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f)
            { 
                ans=start_loop(s,head);
            }                
        }
        return ans;                
    }
    public ListNode detectCycle(ListNode head) {
        ListNode ans= check_Loop(head);
        return ans;
        
    }
}*/
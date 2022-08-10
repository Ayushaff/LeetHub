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
    public boolean hasCycle(ListNode head) {
        //hashtable 
   /* 
        Set<ListNode> set = new HashSet<>();
        while(head != null)
        {
            if(!set.add(head)) {
                return true;
            }
           head = head.next;
        }
         return false;
    }
}
      */

     //2 pointer      optimal
/*
1.Use two pointers, walker and runner.
2.walker moves step by step. runner moves two steps at time.
3.if the Linked List has a cycle walker and runner will meet at some
point.
           */    
    if(head==null) return false;
            
    ListNode walker = head;
    ListNode runner = head;
            
    while(runner.next!=null && runner.next.next!=null)
    {
        
        walker = walker.next;
        runner = runner.next.next;
        
        if(walker==runner) return true;
        
    }
    return false;
}
}
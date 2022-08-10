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
  
        //2 pointer      optimal O(N) O(1)
/*
1.Use two pointers, walker and runner.
2.walker moves step by step. runner moves two steps at time.
3.if the Linked List has a cycle walker and runner will meet at some
point.
           */    
    if(head==null || head.next == null) return false;
            
    ListNode s = head;
    ListNode f = head;
            
    while(f.next!=null && f.next.next!=null) // if null found thats not a cycle
    {
        
        s = s.next;
        f = f.next.next;
        
        if(s==f) return true;
        
    }
    return false;
}
}

     //hashtable O(N) O(N)
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
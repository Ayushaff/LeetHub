/*class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}*/

class Solution {
    public boolean isPalindrome(ListNode head)
    {
        // find middle
        // reverse the right half
        // comapare right half with the left half
        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        // find middle of LL
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the right half
        slow.next = reverseLL(slow.next); // slow.next got the reverse right half

        // move slow to right half
        slow = slow.next;

        while (slow != null) 
        {
            if (head.val == slow.val) 
            {
                head = head.next;
                slow = slow.next;
            } else
                return false;
        }
        return true;
    }     

  public ListNode reverseLL(ListNode head) 
  {     

        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) 
        {

            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        // if(curr==null) System.out.println("asd");
        return prev; // is at last node became as a new head
    }
       
}
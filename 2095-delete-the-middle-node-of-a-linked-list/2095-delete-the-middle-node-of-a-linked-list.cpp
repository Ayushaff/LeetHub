/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
            //base cases
            if(head==NULL)
                    return NULL;
            if(head->next==NULL)
                    return NULL;
            
            //initialize slow - fast to get mid
            ListNode *slow=head,*fast=head;
            
            ListNode *prev;//to store previous of slow 
            while(fast!=NULL && fast->next!=NULL){
                    prev=slow;
                    slow=slow->next;
                    fast=fast->next->next;
                    
            }
            prev->next=slow->next;
            return head;
    }
};
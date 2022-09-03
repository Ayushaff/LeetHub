/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* deleteMiddle(struct ListNode* head){
 
        struct ListNode* prev;
        //base 
        if(head==NULL) return NULL;
        if(head->next==NULL) return NULL;
        
    struct ListNode* slow=head;
    struct ListNode* fast=head;
        
        while(fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            prev=slow;
            slow=slow->next; //slow points the mid node             
        }
        //dlt mid
        prev->next=slow->next; 
        return head;
}
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
        
ListNode* oddEvenList(ListNode* head) 
{
        ListNode *oddh =NULL, *evenh=NULL, *et=NULL , *ot=NULL;
        int c=1;
        while(head!=NULL){
                if(c%2==0){ //even case
                        if(evenh==NULL){
                                evenh=head;
                                et=head;
                                head=head->next;
                        }else{
                                et->next=head;
                                et=et->next;
                                head=head->next;
                        }
                }
                else{ //odd case
                        if(oddh==NULL){
                                oddh=head;
                                ot=head;
                                head=head->next;
                        }else{
                                ot->next=head;
                                ot=ot->next;
                                head=head->next;
                        }
                }
                c++;                
        }
        if(evenh==NULL) return oddh;        
        if(oddh==NULL) return evenh;
        
        ot->next=evenh;
        et->next=NULL;
        
        return oddh;
}
};
          /*
        if(!head) return head;
        ListNode *odd=head, *evenhead=head->next, *even = evenhead;
        while(even && even->next)
        {
            odd->next = odd->next->next;
            even->next = even->next->next;
            odd = odd->next;
            even = even->next;
        }
        odd->next = evenhead;
        return head;
    }
    */

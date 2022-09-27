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
        //tc on sc o1
        int size(ListNode* head){
            int totlen=0;
            
            while(head!=NULL){
                    totlen++;
                    head=head->next;
            }
                return totlen;
        }
    vector<ListNode*> splitListToParts(ListNode* head, int k) {
            //vector of list
            vector<ListNode*>ans;
            
              //len for splitted lists  
            int len=size(head);
            int partSize=len/k;
            int extranodes=len%k;                       
            
             ListNode *curr=head , *prev=NULL;
            
            while(head!=NULL)
            {
                    int eachpart=partSize;
                    ans.push_back(curr);
                    
                    while(eachpart>0){
                        prev=curr;
                        curr=curr->next;
                        eachpart--;
                    }
                    if(extranodes!=0 && curr!=NULL){
                        prev=curr;
                        curr=curr->next;
                        extranodes--;
                    }
                    if(prev!=NULL){
                           head=curr;
                            prev->next=NULL;
                    }
             
            }
                while(ans.size()!=k)
                        ans.push_back(NULL);
            return ans;
    }
};
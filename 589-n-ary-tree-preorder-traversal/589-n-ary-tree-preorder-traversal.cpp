/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<int> preorder(Node* root) {
        //iterative
        
        stack<Node*>st;
        vector<int>ans;
        
        if(root == NULL) return ans;
        st.push(root);
        
        while(!st.empty()){
            
            Node *curr=st.top();
            st.pop();
            ans.push_back(curr->val);
            reverse(curr->children.begin(),curr->children.end());
            
            for(auto child: curr->children){
                st.push(child);
                
            }
        }
        return ans;
    }
};
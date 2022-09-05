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
    vector<vector<int>> levelOrder(Node* root) 
    {
        //initial 
        vector<vector<int>>ans;
        queue<Node *>q;
        q.push(root);
        
        if(root==NULL) 
            return ans;
        
        while(1)
        {
            vector<int>data;
            int sz=q.size();
            if(sz==0)
                return ans;
            while(sz>0)
            {
                Node* tmp=q.front();
                q.pop();
                data.push_back(tmp->val);
                
                for(auto n:tmp->children)
                    q.push(n);
                sz--;
            }
            ans.push_back(data);
        }
        return ans;
    }
};
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode* root) {
        
            queue<TreeNode*>q;
            if(!root)
                    return 0;
            q.push(root);
           int depth=0;
            while(!q.empty()){
                    int sz=q.size();
                    for(int i=0;i<sz;i++){
                    TreeNode* tmp=q.front();
                    q.pop();
                    
                    if(tmp->left!=NULL) 
                            q.push(tmp->left);
                    if(tmp->right!=NULL) 
                            q.push(tmp->right);
                    }
                    depth++;
            }
            return depth;
    }
};
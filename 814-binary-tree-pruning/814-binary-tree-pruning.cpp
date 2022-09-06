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
    bool pruning(TreeNode* root){
        if(!root)
            return 0;
        
        bool l=pruning(root->left);
        bool r=pruning(root->right);
        
        if(!l)    
            root->left=NULL;
        
        if(!r)
            root->right=NULL;
        
        if(l || r)
            return 1;
        
        if(!l && !r && root->val)
            return 1;
   
        return 0;
    }
    TreeNode* pruneTree(TreeNode* root) {
        bool res=pruning(root);
        if(!res)
            return NULL;
        
        return root;
    }
};
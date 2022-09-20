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
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int>preorder;
            stack<TreeNode*>st;
            //l r root
            if(root==NULL) return preorder;            
            
            st.push(root);
            while(!st.empty()) 
            {
                root =st.top();
                    st.pop();
                    
                    
                    if(root->left!=NULL){
                            st.push(root->left);
                    }
                    if(root->right!=NULL){
                            st.push(root->right);
                    }
                    preorder.push_back(root->val);
            }
            reverse(preorder.begin(),preorder.end());
            return preorder;
    }
};
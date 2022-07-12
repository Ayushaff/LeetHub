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
void inOrder(TreeNode *root,int level,map<int,int>& mp){
    if(root==NULL){
        return;
    }
    
    inOrder(root->left,level+1,mp);
    mp[level]=root->val;
    inOrder(root->right,level+1,mp);
    
}
class Solution {
public:
    vector<int> rightSideView(TreeNode* root) {
        
        map<int,int>mp; //level,root value
        inOrder(root,0,mp);
        
        vector<int>ans;
        for(auto i:mp){
            ans.push_back(i.second);
        }
        return ans;        
    }
};
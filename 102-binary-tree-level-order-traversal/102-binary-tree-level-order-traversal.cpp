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
    vector<vector<int>> levelOrder(TreeNode* root) {
        //initial 
        vector<vector<int>> ans; //ans
        if(root==NULL) return ans;
        
        queue<TreeNode*> q;
        q.push(root);     
//         
        while(!q.empty())
        {
            int size=q.size();            
            vector<int> currLevel;
            
            while(size-- >0)
            {
                TreeNode *currNode=q.front();
                q.pop();
                if(currNode->left !=NULL) q.push(currNode->left);
                if(currNode->right !=NULL)q.push(currNode->right);
                
                currLevel.push_back(currNode->val);
                    
            }    
            ans.push_back(currLevel);
        }
        return ans;        
    }
};
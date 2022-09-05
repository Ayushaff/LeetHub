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
    vector<vector<int>> levelOrder(TreeNode* root) 
    {
        //initial 
        vector<vector<int>>ans;
        queue<TreeNode *>q;
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
                TreeNode* tmp=q.front();
                q.pop();
                data.push_back(tmp->val);
                
                if(tmp->left!=NULL)
                    q.push(tmp->left);
                if(tmp->right)
                    q.push(tmp->right);   
                sz--;
            }
            ans.push_back(data);
        }
        return ans;
    }
};
       /* vector<vector<int>> ans; //ans
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
};*/
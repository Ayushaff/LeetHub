class Solution {
public:
    void mark_parents(TreeNode* root, unordered_map<TreeNode*, TreeNode*>& parent_trace) {
        queue<TreeNode*> q;
        q.push(root);

        while (!q.empty()) {
            TreeNode* curr = q.front();
            q.pop();
            if (curr->left) {
                q.push(curr->left);
                parent_trace[curr->left] = curr;
            }
            if (curr->right) {
                q.push(curr->right);
                parent_trace[curr->right] = curr;
            }
        }
    }

    vector<int> distanceK(TreeNode* root, TreeNode* targetNode, int k) {
        unordered_map<TreeNode*, TreeNode*> parent_trace;
        unordered_map<TreeNode*, bool> vis;

        mark_parents(root, parent_trace);

        queue<TreeNode*> q;
        q.push(targetNode);
        vis[targetNode] = true;

        int currlevel = 0;
        vector<int> res;

        while (!q.empty()) {
            int sz = q.size();
            if (currlevel == k) break;
            for (int i = 0; i < sz; i++) {
                TreeNode* curr = q.front();
                q.pop();
                if (curr->left && !vis[curr->left]) {
                    q.push(curr->left);
                    vis[curr->left] = true;
                }
                if (curr->right && !vis[curr->right]) {
                    q.push(curr->right);
                    vis[curr->right] = true;
                }
                if (parent_trace[curr] && !vis[parent_trace[curr]]) {
                    q.push(parent_trace[curr]);
                    vis[parent_trace[curr]] = true;
                }
            }
            currlevel++;
        }

        while (!q.empty()) {
            TreeNode* curr = q.front();
            q.pop();
            res.push_back(curr->val);
        }

        return res;
    }
};

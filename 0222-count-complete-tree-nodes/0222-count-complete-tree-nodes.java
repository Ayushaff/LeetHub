/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int cnt=0;
    public int countNodes(TreeNode root) {
        //brute
        // tc O(n) auxilary sc O(h) if its skew tree and if its complete bt O(log N)  n is no, of nodes
        
        if(root==null)return 0;
        inorder(root);
        return cnt;
    }
    private void inorder(TreeNode root){
          
        if(root==null)return ;
        cnt++;
        inorder(root.left);
        inorder(root.right);
        
    }
}
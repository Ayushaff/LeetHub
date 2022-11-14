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
    int leafSum=0;

    public int sumOfLeftLeaves(TreeNode root) {
         //O(n) at all n nodes O(n) when skew tree recursively storing all n nodes in recursive call stack
        helper(root);
        return leafSum;
    }
    private void helper(TreeNode root){
        if(root==null) return ;
        
        if(isLeafNode(root.left)==true) //if root's left node is leaf node?
            leafSum+=root.left.val;
        helper(root.left);
        helper(root.right);
    }
    private boolean isLeafNode(TreeNode root){
        if(root==null)return false;
        if(root.left==null && root.right==null)
            return true;
        return false;
    }
}
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
public class Solution {
    int maxValue;
    
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    
    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}

/*class Solution {
    public int maxPathSum(TreeNode root) {
        int mxSum=Integer.MIN_VALUE;
        postOrder(root,mxSum);
        return mxSum;
    }
    private int postOrder(TreeNode root,int mxSum){
        if(root==null)
            return 0;
            
            int left=Math.max(0,postOrder(root.left,mxSum));
            int right=Math.max(0,postOrder(root.right,mxSum));
            mxSum=Math.max(mxSum,(left+right+root.val));
            return Math.max(left,right)+root.val;
    }
}*/
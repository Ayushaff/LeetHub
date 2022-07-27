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
    
    public void flatten(TreeNode root) 
     {
         TreeNode curr=root;
        
        while(curr!=null)
        {
            
            if(curr.left!=null)
            {
                TreeNode prev=curr.left;    //at 2
                
                while(prev.right!=null)
                {
                    prev=prev.right;    //at 4
                }
                prev.right=curr.right;  //4's right pointing 5
                curr.right=curr.left;   //1's right pointing to 2
                curr.left = null;
            }
            curr=curr.right;   
        }
    }
}
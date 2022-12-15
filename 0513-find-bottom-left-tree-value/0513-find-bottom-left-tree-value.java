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
    public int findBottomLeftValue(TreeNode root) {
        //just a signle if condition and the whole code is same as levelOrderTraversal
        int res=0;

        Queue<TreeNode >q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode tmp=q.poll();
                if(i==0)
                    res=tmp.val;

                    if(tmp.left!=null)q.offer(tmp.left);
                    if(tmp.right!=null)q.offer(tmp.right);
            }
        }
        return res;
    }
}
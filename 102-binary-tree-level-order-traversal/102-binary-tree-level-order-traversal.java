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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();  //ans
        if(root==null) return res;
        
        Queue<TreeNode>q =new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>currLevel=new ArrayList<>();
            
            while(size-- >0){
                TreeNode currNode=q.poll(); //front polled from queue ,stored to currNode
                currLevel.add(currNode.val);
                
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
                               
            }
            res.add(currLevel);
        }       
        return res;
    }
}
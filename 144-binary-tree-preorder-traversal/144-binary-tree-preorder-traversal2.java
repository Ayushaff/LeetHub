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
    public List<Integer> preorderTraversal(TreeNode root) {
            //root l r queue implemetation
        List<Integer>list=new ArrayList<>();
            Queue<TreeNode>q=new LinkedList<TreeNode>();
            
            if(root==null) return list;
            
            q.add(root);
            while(!q.isEmpty()){
                    root=q.poll();
                    list.add(root.val);
                    if(root.right!=null){
                            q.add(root.right);
                    }
                    if(root.left!=null){
                            q.add(root.left);
                    }
            }
            return list;
    }
}

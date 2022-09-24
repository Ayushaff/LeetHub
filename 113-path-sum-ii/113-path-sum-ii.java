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
    public void pathsum(TreeNode root, int targetSum,List<List<Integer>>res,ArrayList<Integer>smallans) {
            if(root==null) return;
            
            if(root.left ==null && root.right ==null){
                    if(targetSum-root.val==0){
                            ArrayList<Integer>base=new ArrayList<>(smallans);
                            base.add(root.val);
                            res.add(base);
                    }
                    return;
            }
            smallans.add(root.val);
            
            pathsum(root.left,targetSum-root.val,res,smallans);
            pathsum(root.right,targetSum-root.val,res,smallans);
            
            smallans.remove(smallans.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        //result list ke andar koi dusri list store krni h toh yha result list me un lists ka address ajayga shallow copy
            
            List<List<Integer>>res=new ArrayList<>();
            ArrayList<Integer>smallans=new ArrayList<>();
            
            pathsum(root,targetSum,res,smallans);
            return res;
    }
}
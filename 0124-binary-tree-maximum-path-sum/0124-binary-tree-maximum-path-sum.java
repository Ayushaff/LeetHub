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
/*
Approach: Post Order DFS
Intuition
One way to find the maximum path sum would be to look at all possible paths, calculate their path sums, and then find the maximum path sum. However, this would be a "brute force" approach. If there are nn nodes in the tree, creating all the paths and computing their path sums would take O(n ^ 2)O(n 
2
 ) time. We can do better than this.

Consider a scenario where the path with the highest sum passes through the tree's root.

There could be four possibilities.

The path starts at the root and goes down through the root's left child. We don't know how long the path is, but it could extend to the bottom of the left subtree.
The path starts at the root and goes down through the root's right child. Very similar to the previous case, but the direction is toward the right.
The path involves both the left and the right child.
The path doesn't involve any child. The root itself is the only element of the path with maximum sum.
Current
1 / 4
We know that the path contains the root. Therefore, in the beginning, we can assume that the path sum is the root node's value. To find the maximum path sum, we determine if there is a viable path leading down through the left or the right subtree. Please remember that a node can have negative or positive values. So a path sum contributed by a subtree could also be negative or positive. It would make sense to consider a path sum contributed by a subtree only if it is positive. If not, we can safely ignore it. In other words, the path goes down the left or the right subtree only if we see a gain in the path sum.

This means we must first determine the gain in the path sum contributed by the left and the right subtree. Once we have both, we decide whether to include their contribution. We can see that we need to process the children before we process a node. This indicates that we need to perform a post-order traversal of the tree because, in post-order, children are processed before the parent.

To implement post-order traversal, we implement a recursive function. This function takes the root of the subtree as the input. The function returns the path sum gain contributed by the subtree. To calculate the path sum gain, the function calls itself recursively on the subtree's left and right child.

We have considered the scenario where the maximum sum path passes through the root. But what if it doesn't?

When root is not a part of the maximum path sum


We slightly tweak our algorithm to include the case when the path sum doesn't pass through the root. Now, in addition to returning the path sum gain contributed by the subtree, the recursive function also keeps track of the maximum path sum. We update the maximum path sum whenever we find a new maximum.

Let's put this formally now. Let's name our recursive function gain_from_subtree. It takes the root of a subtree as the input. The function has two responsibilities.

The function returns the path sum gain contributed by the subtree.

The path sum gain contributed by the subtree can be derived from a path that includes at most one child of the root. You may wonder, why can't we include both children? If we include both children in the path, the path would have to make a fork at the root. The root is already connected to its parent. Now, if we include both children as well, with three connections, it wouldn't be a valid path anymore. Therefore, we can say that the path would consist of at most one child of the root.

The recursive function compares left_gain and right_gain and adds the maximum of the two to the value of the root. The sum, gain_from_subtree is then returned to the caller.

left_gain = max(gain_from_left_subtree, 0)
right_gain = max(gain_from_right_subtree, 0)
gain_from_subtree = max(left_gain, right_gain) + root.val
We use max(gain_from_left_subtree, 0) because we want to consider the gain only if it is positive. If it is negative, we ignore it or consider it as zero.

The function keeps track of the maximum path sum.

Assuming that the maximum path sum passes through the root of the subtree, as explained earlier, we consider all four possibilities - (1) The path goes through the left subtree (2) The path goes through the right subtree (3) The path goes through both left and right subtrees (4) The path doesn't involve left or right subtrees. So we include the left and right gain if they are positive and the value of the root node. We compare this sum with the current maximum path sum and update it if necessary. The following code segment takes care of all four possibilities.

max_path_sum = max(max_path_sum, left_gain + right_gain + root.val)
Algorithm
Main function body
Initialize a global variable max_sum to -Infinity.
Call the function gain_from_subtree on the tree's root.
Return the value of max_sum.
Body of the recursive function gain_from_subtree. It accepts root of the subtree as the input.
If the root is null, return 0. This is the base case. If a node doesn't have a left or right child, then the path sum contributed by the respective subtree is 0.
Call the function recursively on the left and right child of the root. Store the results in gain_from_left and gain_from_right, respectively.
If either is negative, set it to 0. This is because we don't want to include a path sum contributed by a subtree if it is negative.
Update the maximum path sum (max_sum) seen so far. To do so, compare max_sum with the sum of the following, and update it if it is smaller.
The value of the root itself.
gain_from_left (0 if negative)
gain_from_right (0 if negative)
Return the path sum gain contributed by the subtree. This is the maximum of the following two values.
The value of the root plus gain_from_left.
The value of the root plus gain_from_right.
A note on the base case
Let's say our recursive algorithm reaches a node with no left child. Because there is no left child, our path cannot go toward the left subtree. In other words, the gain from the left subtree is 00. So, when the function is called on the non-existent child of the node, it returns 00. This would be true for a non-existent right child as well. Therefore, we can safely say that the base case is when the root is null.
*/
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        // Check if the left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        // If both nodes are null, they are symmetric
        if (node1 == null && node2 == null) {
            return true;
        }
        // If only one of the nodes is null, they are not symmetric
        if (node1 == null || node2 == null) {
            return false;
        }
        
        // Check if values are equal and their respective subtrees are mirrors
        return (node1.val == node2.val) 
            && isMirror(node1.left, node2.right) 
            && isMirror(node1.right, node2.left);
    }
}
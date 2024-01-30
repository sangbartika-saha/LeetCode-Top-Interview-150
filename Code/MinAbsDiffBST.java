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
    // Initialize minDiff with a large value
    private int minDiff = Integer.MAX_VALUE;
    // Initialize prev to null
    private TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        // Check if the root is null
        if (root == null) {
            return 0;
        }

        // Recursively traverse the tree
        traverse(root);

        // Return the minimum difference
        return minDiff;
    }

    private void traverse(TreeNode node) {
        // Base case: if the node is null, return
        if (node == null) {
            return;
        }

        // Recursively traverse the left subtree
        traverse(node.left);

        // Update minDiff with the absolute difference between node.val and prev.val
        if (prev != null) {
            minDiff = Math.min(minDiff, Math.abs(node.val - prev.val));
        }

        // Update prev to the current node
        prev = node;

        // Recursively traverse the right subtree
        traverse(node.right);
    }
}

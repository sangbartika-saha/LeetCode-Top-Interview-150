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
    public int countNodes(TreeNode root) {
         int count=0;
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            int rootleft=countNodes(root.left);
            count+=rootleft;
        }
        if(root.right!=null){
            int rootright=countNodes(root.right);
            count+=rootright;
        }
        
        return count+1;
    }
}
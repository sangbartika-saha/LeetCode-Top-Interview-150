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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        return validate(root,null,null);
    }
    private boolean validate(TreeNode root,Integer startRange,Integer endRange){
        if(root==null){
            return true;
        }
        if((startRange!= null && root.val<=startRange) || (endRange!=null && root.val>= endRange)){return false;}
        return validate(root.left,startRange,root.val)&& validate(root.right,root.val,endRange);
    }
}
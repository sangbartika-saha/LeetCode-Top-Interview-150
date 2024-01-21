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
    boolean help(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(q==null)return false;
        if(p==null)return false;
        if(p.val!=q.val)return false;
        if(help(p.left,q.left)==true && help(p.right,q.right)==true)return true;
        else return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return help(p,q);
    }
}
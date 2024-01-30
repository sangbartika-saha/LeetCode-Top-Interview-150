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
	HashMap<Integer, Integer> hmap;
	int index; // used for PREORDER ARRAY 
	
	public TreeNode recur(int preorder[], int start, int end)
	{
	    if(start > end)
	    {
	        return null;
	    }
	    
	    TreeNode rootNode = new TreeNode(preorder[index]);
	    index++;
	    
	    if(start == end)
	    {
	        return rootNode;
	    }
	    
	    int whereInOrderPresent = hmap.get(rootNode.val);
	    rootNode.left = recur(preorder, start, whereInOrderPresent - 1);
	    rootNode.right = recur(preorder, whereInOrderPresent + 1, end);
	    
	    return rootNode;
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		hmap = new HashMap<>();
		index = 0;
		
		int n = inorder.length;
		
		for(int i=0; i<n; i++)
		{
		    hmap.put(inorder[i], i);
		}
		
		return recur(preorder, 0, n-1);
	}
}
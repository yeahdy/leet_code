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
    List<Integer> list = new ArrayList<>();
	public boolean isUnivalTree(TreeNode root) {		
		if(root == null) return false;
		
		list.add(root.val);
		return preOrder(root, list);
    }
	
	private boolean preOrder(TreeNode root, List<Integer> list) {
		if(root == null) return true;
		
		if(list.get(0) != root.val) {
			return false;
		}
        
        return preOrder(root.left, list) && preOrder(root.right, list);
	}
    
}
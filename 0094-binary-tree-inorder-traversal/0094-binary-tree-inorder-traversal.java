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
    List<Integer> result = new ArrayList<>();
	
	public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
        	return result; 
        }
		
        // left 부터 시작
		if(root.left != null) {
			inorderTraversal(root.left);
		} 		
		// 더 이상 left 가 없으면 해당 노드가 root가 된다
		result.add(root.val);
		
		//right 있는지 확인
		if(root.right != null) {
			inorderTraversal(root.right);
		}
		
		return result;
               
    }
}
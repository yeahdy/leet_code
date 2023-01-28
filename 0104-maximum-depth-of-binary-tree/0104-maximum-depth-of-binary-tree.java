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
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
        
        int leftCnt = maxDepth(root.left);
        System.out.println("left :: "+ leftCnt);
        
        int rightCnt = maxDepth(root.right);
        System.out.println("right :: "+ rightCnt);
        
        // 왼쪽, 오른쪽 나누어서 비교
        return Math.max(leftCnt, rightCnt) + 1;
	}
	
}
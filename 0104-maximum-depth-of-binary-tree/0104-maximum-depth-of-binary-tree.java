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
        
        int leftCnt = maxDepth(root.left); //9: null(0), 20: 15: (1) 
        int rightCnt = maxDepth(root.right); // 9: null(0), 20: 7: (l)
        
        return Math.max(leftCnt, rightCnt) + 1;
        
        // +1 의 의미
        //	1)최초의 루트 레벨
        //	2)해당 루트의 자식 유무를 통한 레벨 확인: 자식이 있다면 1, 없다면 0
        //	만약에 어떤 루트가 left 또는 right 둘 중 하나라도 자식이 있다면 다음 레벨이 있다는 뜻
        //	3)리프노드 부터 위로 올라가며 레벨을 카운트 하는 방식
        
        // POINT!: 계속해서 left와 right를 나눠서 비교하며 넓이를 탐색한다.
	}
	
}
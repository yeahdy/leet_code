/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    // 순회한다면 slow가 한바퀴 순회할 때 fast는 2번 순회한다.
    // 즉, 2번 순회한다는 것은 그 전으로 뒤에 있는 노드로 돌아가는것 == 순회중
    // 따라서 2번 순회한다는 것을 증명하는 것은 slow == fast 일때
    // 만약 순회하지 않는다면 fast 는 계속 해서 앞으로 나아가기 때문에 만나지 않는다. == pos가 -1일 경우
    
    public boolean hasCycle(ListNode head) {
    	ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;

          if (slow == fast) return true;
        }
        return false;
    }
    
}
    	

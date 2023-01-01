/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        int length= 1, middle= 0, i= 0;
		
		// 길이 확인
		ListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
			length++;
		}
		middle = (length/2)+1;
		
		
		ListNode current = head;
		while(head != null) {
            i++;
			// middle부터 끝까지 담기
			if(middle == i) {
				System.out.println("i? "+i + " head.val? " + head.val);
				current = head;
				break;
			}    
            head = head.next;
		}
		
		return current;
    }
}
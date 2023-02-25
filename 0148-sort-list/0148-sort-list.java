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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
		int count = 0, i=0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		//node 의 값들을 배열에 모두 담는다 > 정렬하기 위해
		temp = head;
		int[] arr = new int[count];
		while(temp != null) {            
			arr[i] = temp.val;
			temp = temp.next;
			i++;
		}
		// 정렬
		Arrays.sort(arr);
        
		
		// 정렬된 값 노드에 담기
		temp = head;	// 주소값을 옮기고 해당 노드의 객체의 값을 정렬된 값으로 변경한다
		i= 0;
		while(temp != null) {
			temp.val = arr[i];
			temp = temp.next;
            i++;
		}
		
		return head;
    }
}
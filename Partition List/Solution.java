public class Solution {
	public ListNode partition(ListNode head, int x) {
		ListNode small = new ListNode(0);
		ListNode small0 = small;
		ListNode large = new ListNode(0);
		ListNode large0 = large;
		while (head != null) {
			ListNode next = head.next;
			if (head.val >= x) {
				large.next = head;
				large = large.next;
				large.next = null;
			} else {
				small.next = head;
				small = small.next;
				small.next = null;
			}
			head = next;
		}
		small.next = large0.next;

		return small0.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
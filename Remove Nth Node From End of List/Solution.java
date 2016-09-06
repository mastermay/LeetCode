public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null) {
			return null;
		}
		ListNode p1 = head;
		ListNode pre = null;
		ListNode p2 = head;
		for (int i = 0; i < n - 1; i++) {
			p2 = p2.next;
		}

		while (p2.next != null) {
			pre = p1;
			p1 = p1.next;
			p2 = p2.next;
		}
		if (pre == null)
			return p1.next;
		pre.next = p1.next;
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
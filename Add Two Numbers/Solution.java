public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode l3 = new ListNode(0);
		ListNode poiner = l3;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			ListNode l = new ListNode(carry % 10);
			poiner.next = l;
			poiner = l;
			carry = carry / 10;

		}
		if (carry == 1) {
			poiner.next = new ListNode(1);
		}
		return l3.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public ListNode sortList(ListNode head) {
		return sort(head);
	}

	public ListNode sort(ListNode head) {
		if ((head == null) || (head.next == null)) {
			return head;
		}

		ListNode[] list = split(head);

		return merge(sort(list[0]), sort(list[1]));
	}

	public ListNode merge(ListNode left, ListNode right) {
		ListNode result = new ListNode(0);
		ListNode p = result;

		while (left != null && right != null) {
			if (left.val <= right.val) {
				p.next = left;
				p = p.next;
				left = left.next;
			} else {
				p.next = right;
				p = p.next;
				right = right.next;
			}
			p.next = null;
		}
		if (left != null) {
			p.next = left;
		}
		if (right != null) {
			p.next = right;
		}
		return result.next;
	}

	public ListNode[] split(ListNode source) {
		ListNode left, right, fast, slow;

		if (source == null || source.next == null) {
			left = source;
			right = null;
		} else {
			slow = source;
			fast = source.next;

			while (fast != null) {
				fast = fast.next;
				if (fast != null) {
					slow = slow.next;
					fast = fast.next;
				}
			}

			left = source;
			right = slow.next;
			slow.next = null;
		}
		ListNode[] list = { left, right };
		return list;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
public class Test {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(7);
		ListNode node5 = new ListNode(6);

		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;

		head = new Solution().sortList(head);

		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
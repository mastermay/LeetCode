public class Test {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode n = new Solution().removeNthFromEnd(n1, 2);
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}
}

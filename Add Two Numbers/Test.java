public class Test {
	public static void main(String[] args) {
		// [7,0,3,6,7,3,2,1,5]
		// [9,2,5,5,6,1,2,2,4]
		// 638145239
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(0);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(6);
		ListNode l5 = new ListNode(7);
		ListNode l6 = new ListNode(3);
		ListNode l7 = new ListNode(2);
		ListNode l8 = new ListNode(1);
		ListNode l9 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		l9.next = null;
		ListNode ll1 = new ListNode(9);
		ListNode ll2 = new ListNode(2);
		ListNode ll3 = new ListNode(5);
		ListNode ll4 = new ListNode(5);
		ListNode ll5 = new ListNode(6);
		ListNode ll6 = new ListNode(1);
		ListNode ll7 = new ListNode(2);
		ListNode ll8 = new ListNode(2);
		ListNode ll9 = new ListNode(4);
		ll1.next = ll2;
		ll2.next = ll3;
		ll3.next = ll4;
		ll4.next = ll5;
		ll5.next = ll6;
		ll6.next = ll7;
		ll7.next = ll8;
		ll8.next = ll9;
		ll9.next = null;

		print(new Solution().addTwoNumbers(l1, ll1));
	}

	public static void print(ListNode l) {
		while (l != null) {
			System.out.println(l.val + " ");
			l = l.next;
		}
	}
}

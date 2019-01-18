package medium;


public class AddTwoNumbers_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode l1 = node1;
		node1.next = new ListNode(8);
		
		ListNode node2 = new ListNode(0);
		ListNode l2 = node2;

		ListNode node = addTwoNumbers(l1, l2);
		while(node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
	}
	
	//Definition for singly-linked list.
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node = new ListNode(0);
		ListNode result = node;
		int sum = 0;
		int digits = 0;
		int carrys = 0;
		while (l1 != null && l2 != null) {
			node.next = new ListNode(0);
			node = node.next;
			sum = l1.val + l2.val + carrys;
			carrys = sum / 10;
			node.val = sum % 10;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l2 != null) {
			node.next = new ListNode(0);
			node = node.next;
			sum = l2.val + carrys;
			carrys = sum / 10;
			node.val = sum % 10;
			l2 = l2.next;
		}
		while (l1 != null) {
			node.next = new ListNode(0);
			node = node.next;
			sum = l1.val + carrys;
			carrys = sum / 10;
			node.val = sum % 10;
			l1 = l1.next;
		}
		if (carrys != 0) {
			node.next = new ListNode(carrys);
			node = node.next;
		}
		return result.next;
	}
}

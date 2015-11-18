public class LinkedList_KthNodeFrmEnd {
	static Node head;

	public static void main(String args[]) {

		head = new Node(3);
		Node n1 = new Node(5);
		Node n2 = new Node(11);
		Node n3 = new Node(2);
		Node n4 = new Node(7);
		Node n5 = new Node(9);
		Node n6 = new Node(33);
		Node n7 = new Node(1);
		Node n8 = new Node(8);
		Node n9 = new Node(156);
		Node n10 = new Node(10);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;

		int k = 3;

		Node p = ReverseAllKNodes(head, k);

		print(p);
		// KthFromEnd(head, k);
		System.out.println("");

	}

	private static Node ReverseAllKNodes(Node head2, int k) {

		Node current = head2;
		Node previos = null, nextt = null;
		int temp = 0;

		while (current != null && temp < k) {
			nextt = current.next;
			current.next = previos;
			previos = current;
			current = nextt;
			temp++;
		}
		if (nextt != null) {
			head2.next = ReverseAllKNodes(nextt, k);
		}

		return previos;
	}

	static void print(Node head) {

		while (head != null) {
			System.out.print(head.data + "  ");
			head = head.next;
		}

	}

	private static void KthFromEnd(Node head2, int k) {

		Node fastPtr = head2;
		Node slowPtr = head2;

		for (int i = 0; i < k; i++) {
			fastPtr = fastPtr.next;
		}

		while (fastPtr != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}

		System.out.println(k + "-eth" + "node from end: " + slowPtr.data);

	}

}
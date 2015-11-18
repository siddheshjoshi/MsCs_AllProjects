class Node {

	Node next;
	int data;

	Node(int i) {
		this.data = i;
	}

}

public class myReverse {
	static Node head;

	public static void main(String args[]) {

		head = new Node(3);
		Node n1 = new Node(5);
		Node n2 = new Node(11);
		Node n3 = new Node(2);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		print(head);
		System.out.println("");
		Node result = recReversify(head);
		print(result);
	   // reversify(head);

	}

	private static Node recReversify(Node node) {
		Node rec;
		if(node.next==null){
			return node;
		}
		else{
			rec = recReversify(node.next);
			node.next.next=node;
			node.next=null;
		}
		
		return rec;
		

	}

	private static void reversify(Node head2) {

		Node current = head2;
		Node previos = null, nextt = null;

		while (current != null) {
			nextt = current.next;
			current.next = previos;
			previos = current;
			current = nextt;
		}
		System.out.println("");
		print(previos);

	}

	static void print(Node head) {

		while (head != null) {
			System.out.print(head.data + "  ");
			head = head.next;
		}

	}

}

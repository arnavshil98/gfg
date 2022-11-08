package vishnu;
/*
 * making fundamental linkedlist nodes.
 * each refer data and reference of next node.
 */
public class Node {
	Integer data;
	Node next;

	Node(Integer x) {
		this.data = x;
		this.next = null;
	}


	// linear method to transverse through the linked list
	public static void printElements(Node head) {
		while (head != null) {
			System.out.print(" " + head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20); // referencing next node to 10.
		head.next.next = new Node(30); // referencing next node to 20.
		
		printElements(head);
	}

}

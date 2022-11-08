package vishnu;

import vishnu.LinkedList.Node;

public class DoublyLinkedList {
//adding to last

	Node head;

	public static class Node {
		int data;
		Node nextHead, previousTail;

		Node(int x) {
			this.data = x;
			this.nextHead = null;
			this.previousTail = null;
		}
	}

	
	public static void printList(DoublyLinkedList list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.nextHead;
		}
	}
	
	
	public static DoublyLinkedList insertLast(DoublyLinkedList list, int x) {

		Node currNode = new Node(x);
		if (list.head == null) {
			list.head = currNode;
		}
		else {
			Node last = list.head;
			while(last.nextHead!=null) {
				last = last.nextHead;
			}
			last.nextHead = currNode;
			currNode.previousTail = list.head;
		}
		return list;
	}

	// adding to first
	
	public static DoublyLinkedList insertFirst(DoublyLinkedList list, int x) {

		Node currNode = new Node(x);
		if (list.head == null) {
			list.head = currNode;
		}
		else {
			currNode.previousTail = null;
			currNode.nextHead = list.head;
			list.head.previousTail = currNode;
			list.head = currNode;
		}
		return list;
	}
	// adding after a given key
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		insertLast(list, 10);
		insertLast(list, 20);
		insertLast(list, 30);
		insertFirst(list, 15);
		insertLast(list, 40);
		insertFirst(list, 5);
		printList(list);
	}

}

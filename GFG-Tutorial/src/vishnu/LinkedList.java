package vishnu;

public class LinkedList {

	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int x) {
			this.data = x;
			this.next = null;
		}
	}
	// insert(LinkedList list, int data);

	public static LinkedList insertLast(LinkedList list, int data) {
		Node newHead = new Node(data);
		// no such node exist for the given list.
		if (list.head == null) {
			list.head = newHead;
		} else {
			// reference of this head will
			// be alloted to next of previous
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newHead;
		}

		return list;
	};

	public static LinkedList insertFirst(LinkedList list, int data) {
		Node newHead = new Node(data); // int data = data and Node next = null
		Node oldHead = list.head; // taking reference of already existing list head.
		list.head = newHead; // now changing the list head to newHead
		list.head.next = oldHead;

		return list;
	}

	public static LinkedList insertAfterNode(LinkedList list, int data, int key) {
		Node currNode = list.head;
		while (currNode != null) {
			if (currNode.data == key)
				break;
			else {
				currNode = currNode.next;
			}
		}
		Node newNode = new Node(data);
		newNode.next = currNode.next;
		currNode.next = newNode;

		return list;
	}

	// deleting data from list using key
	public static LinkedList deleteByKey(LinkedList list, int key) {
		// Store head node
		Node currNode = list.head, prev = null;

//
// CASE 1:
// If head node itself holds the key to be deleted

		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head

			// Display the message
			System.out.println(key + " found and deleted");

			// Return the updated List
			return list;
		}

		//
		// CASE 2:
		// If the key is somewhere other than at head
		//

		// Search for the key to be deleted,
		// keep track of the previous node
		// as it is needed to change currNode.next

		while (currNode != null && currNode.data != key) {
// If currNode does not hold key
// continue to next node
			prev = currNode;
			currNode = currNode.next;
		}

// If the key was present, it should be at currNode
// Therefore the currNode shall not be null
		if (currNode != null) {
// Since the key is at currNode
// Unlink currNode from linked list
			prev.next = currNode.next;

// Display the message
			System.out.println(key + " found and deleted");
		}

//
// CASE 3: The key is not present
//

// If key was not present in linked list
// currNode should be null
		if (currNode == null) {
// Display the message
			System.out.println(key + " not found");
		}

// return the List
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList list = new LinkedList();

		insertLast(list, 10);
		insertLast(list, 20);
		insertLast(list, 30);
		insertFirst(list, 45);
		insertAfterNode(list,12,20);
		printList(list);
	}
}
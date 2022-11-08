package vishnu;

/*
 * To delete a node from the linked list, do following steps.  

Search the key for its first occurrence in the list
Now, Any of the 3 conditions can be there: 


Case 1: The key is found at the head 
In this case, Change the head of the node to the next node of the current head. 
 
Free the memory of the replaced head node.


Case 2: The key is found in the middle or last, except at the head 
In this case, Find the previous node of the node to be deleted. 
Change the next the previous node to the next node of the current node.
Free the memory of the replaced node.


Case 3: The key is not found in the list 
In this case, No operation needs to be done. 
 */
public class DeletingByKeyLinkedList {

	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int x) {
			this.data = x;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		/* Start with the empty list. */
		LinkedList list = new LinkedList();


	}

}

package shiva;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BtreeLinkedListTest {
	/*
	 * providing user input root left, right left-left, left-right,
	 * right-left,right-right
	 */

	public static class Node {

		int key;
		Node left;
		Node right;

		public Node(int x) {
			this.key = x;
		}
	}

	static Scanner sc = new Scanner(System.in);
	static Deque<Node> dequeue = new LinkedList<Node>();

	/*
	 * methods declared static then, it can access only static members
	 */

	public Node insertElements(Node root, int key) { // O(1)
		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
			dequeue.add(newNode);
			return root;
		} else {
			Node node;
			node = dequeue.remove(); // most important line
			if (node.left == null) {
				node.left = newNode;
				dequeue.add(newNode);
				dequeue.addFirst(node);
				return root;
			} else if (node.right == null) {
				node.right = newNode;
				dequeue.add(newNode);
				return root;
			}
		}
		return root;
	}
	
	

	public static void main(String[] args) {
		BtreeLinkedListTest obj = new BtreeLinkedListTest();
		Node node = null;
		int i = 1;
		while (i <= 7) {
			System.out.println("please provide input: ");
			int value = sc.nextInt();
			node= obj.insertElements(node, value);
			i++;
		}

		Iterator<Node> itr = dequeue.iterator();
		while (itr.hasNext()) {

			System.out.print(" " + itr.next().key);

		}
	}

}

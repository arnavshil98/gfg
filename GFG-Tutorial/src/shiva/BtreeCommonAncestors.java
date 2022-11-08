package shiva;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import shiva.BtreeLinkedListTest.Node;

public class BtreeCommonAncestors {

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
	

	static Queue<Node> queue = new LinkedList<Node>();

	public void levelOrderTraversal(Node node) {
		if (queue.isEmpty()) {
			queue.add(node);

		}
		System.out.println("\n");
		while (!queue.isEmpty()) {

			node = queue.poll();

			if (node != null) {
				System.out.println(node.key);
				queue.add(node.left);
				queue.add(node.right);
			}
		}
	}
	
	public static void main(String[] args) {

	}

}

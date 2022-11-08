package shiva;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeLevelOrderTraversal {

	static Scanner sc = new Scanner(System.in);
	static Deque<Node> dequeue = new LinkedList<Node>();

	public static class Node {

		int key;
		Node left;
		Node right;

		public Node(int x) {
			this.key = x;
		}
	}

	public Node insertElements(Node root, int key) { // O(1)
		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
			dequeue.add(newNode);
			return root;
		} else {
			Node node;
			node = dequeue.remove();
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
	
	public void inorderTraversal(Node node) {
		if(node==null) return;
		inorderTraversal(node.left);
		System.out.println(node.key);
		inorderTraversal(node.right);
	}
	
	public void preOrderTraversal(Node node) {
		if(node==null) return;
		System.out.println(node.key);
		inorderTraversal(node.left);
		inorderTraversal(node.right);
	}

	public void postOrderTraversal(Node node) {
		if(node==null) return;
		
		inorderTraversal(node.left);
		inorderTraversal(node.right);
		System.out.println(node.key);
	}

	
	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversal obj = new BinaryTreeLevelOrderTraversal();
		Node node = null;
		int i = 1;
		while (i <= 6) {
			System.out.println("please provide input: ");
			int value = sc.nextInt();
			node = obj.insertElements(node, value);
			i++;
		}
		System.out.println("level order traversal");
		obj.levelOrderTraversal(node);
		
		System.out.println("inorder traversal");
		obj.inorderTraversal(node);
		
		System.out.println("preorder traversal");
		obj.preOrderTraversal(node);
		
		System.out.println("post order traversal");
		obj.postOrderTraversal(node);
	}

}

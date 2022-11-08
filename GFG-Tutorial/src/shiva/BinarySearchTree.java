package shiva;

import java.util.Scanner;

import shiva.BtreeLinkedListTest.Node;

public class BinarySearchTree {

	Scanner sc = new Scanner(System.in);

	public static class Node {

		int key;
		Node left, right;

		public Node(int x) {
			this.key = x;
		}
	}

	public Node insertElement(Node root, int x) {
		if (root == null) {
			return (new Node(x));
		}
		if (x < root.key)
			root.left = insertElement(root.left, x);
		else if (x > root.key)
			root.right = insertElement(root.right, x);
		else // Duplicate keys not allowed
			return root;

		return root;
	}

	public Node rightRotation(Node y) {
		Node x = y.left;
		Node t2 = x.right;
		// right rotation
		x.right = y;
		y.left = t2;
		return x;
	}

	public Node leftRotation(Node x) {
		Node y = x.right;
		Node t2 = y.left;
		// left rotation
		y.left = x;
		x.right = t2;
		return y;
	}

	public Node insertElementAvl(Node root, int x) {
		/*
		 * always start from the root node. and will return updated tree as a root.
		 * containing all the references.
		 */
		// create node
		if (root == null) {
			return (new Node(x));
		}
		if (x < root.key)
			root.left = insertElementAvl(root.left, x);
		else if (x > root.key)
			root.right = insertElementAvl(root.right, x);
		else // Duplicate keys not allowed
			return root;

		System.out.println("-----------------------------------");
		int height = heightOfNode(root);
		System.out.println();
		System.out.println("height of node: " + height);
		int balance = balanceofNode(root);
		System.out.println("balance: " + balance);
		if (balance < -1 && x > root.right.key) {
			// left rotation
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Left Rotation");
			return leftRotation(root);
		} else if (balance > 1 && x < root.left.key) {
			// right rotation
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Right Rotation");
			return rightRotation(root);
		} else if (balance > 1 && x > root.left.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing left Rotation");
			root.left = leftRotation(root.left);
			System.out.println("next, performing Right Rotation");
			return rightRotation(root);
		} else if (balance < -1 && x < root.right.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Right Rotation");
			root.right = rightRotation(root.right);
			System.out.println("next, performing left Rotation");
			return leftRotation(root);
		}

		return root;
	}

	public void inorderTraversal(Node node) {
		if (node == null)
			return;
		inorderTraversal(node.left);
		System.out.println("balance of node: " + node.key + " is " + balanceofNode(node));
		inorderTraversal(node.right);

	}

	public Boolean search(Node node, int x) {
		node = search_Recursive(node, x);
		if (node != null) {
			return true;
		} else
			return false;
	}

// best case and average case O(log n).
	// worst case O(h).
	static Node search_Recursive(Node root, int key) {
		// when root is null or key is present at root
		if (root == null || root.key == key)
			return root;// when value is greater than root's key
		if (root.key > key)
			return search_Recursive(root.left, key);// when value is less than root's key
		else {
			return search_Recursive(root.right, key);
		}
	}

	// printing the left node of a recursive tree
	public void leftNodes(Node node) {
		if (node == null)
			return;
		System.out.println(" " + node.key);
		leftNodes(node.left);
	}

	// height of a BST. O(log n)
	public static int heightOfNode(Node node) {
		if (node == null)
			return 0;
		return Math.max(heightOfNode(node.left), heightOfNode(node.right)) + 1;

	}

	public static int balanceofNode(Node node) {
		if (node == null)
			return 0;
		int hl = heightOfNode(node.left);
		int hr = heightOfNode(node.right);
		return hl - hr;
	}

	// determine the longest path of the tree. from live session

	// left(RR rotation)/right(LL rotation) rotation of the BST.

	// deleting node
	public static Node delete_recursive(Node node, int key) {
		if (node == null)
			return node;

		if (key < node.key)
			/*
			 * here we are replacing the node with, node returned from
			 * delete_recursive(node.left, key);
			 */
			node.left = delete_recursive(node.left, key);
		else if (key > node.key)
			/*
			 * here we are replacing the node with, node returned from
			 * delete_recursive(node.right, key);
			 */
			node.right = delete_recursive(node.right, key);
		else {
			// node contains only one or no child node
			if (node.left == null)
				return node.right;
			else if (node.right == null)
				return node.left;

			// node contains two children
			// find the min of the two from the right subtree and replace it.
			node.key = minValue(node.right);
			// delete inorder successor
			node.right = delete_recursive(node.right, node.key);
		}
		return node;
	}

	private static int minValue(Node node) {
		// TODO Auto-generated method stub
		int minVal = node.key;
		while (node.left != null) {
			minVal = node.left.key;
			node = node.left;
		}
		return minVal;
	}

	public static void main(String[] args) {
		BinarySearchTree obj = new BinarySearchTree();
		Node root = null;
		int[] arr = {42,33,55,21,39,41}; // BST
		for (int i : arr) {
			if (root == null) {
				root = obj.insertElementAvl(root, i);
				// root = obj.insertElement(root, i);
			} else {
				root = obj.insertElementAvl(root, i);
				// root = obj.insertElement(root, i);
			}
		}
		System.out.println("inorder traversal: ");
		obj.inorderTraversal(root);
		System.out.println("\n" + "searching 89: ");
		System.out.println(obj.search(root, 89));
		System.out.println("printing left skew");
		obj.leftNodes(root);
		System.out.println("------------- deleting 34 -------------------");
		delete_recursive(root, 33);
		System.out.println("inorder traversal: ");
		obj.inorderTraversal(root);
	}

}

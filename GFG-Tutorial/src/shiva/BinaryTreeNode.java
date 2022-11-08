package shiva;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNode {
	int key;
	BinaryTreeNode left;
	BinaryTreeNode right;

	BinaryTreeNode(int x) {
		this.key = x;
	}

	public static void inorderTraversal(BinaryTreeNode tree) {
		/*	
		 * recursive code
		 */
		if (tree == null)
			return;
		inorderTraversal(tree.left);
		System.out.println(tree.key);
		inorderTraversal(tree.right);

	}

	public static int heightOfTree(BinaryTreeNode tree) {
		if (tree == null)
			return 0;
		return Math.max(heightOfTree(tree.left), heightOfTree(tree.right)) + 1;

	}

	public static void elementAtLevel(BinaryTreeNode tree, int i, int level) {

		if (i > level) {
			return;
		} else if (i == level) {
			System.out.print(" " + tree.key);

		}
		i = i + 1;
		if (tree.left != null) {
			elementAtLevel(tree.left, i, level);
		}

		if (tree.right != null) {
			elementAtLevel(tree.right, i, level);
		}
	}

	/*
	 * inefficient solution as recursive the order is O(n). instead use queue ->
	 * O(1).
	 */
	public static void levelOrderTransversalRecursive(BinaryTreeNode tree) {
		int max = heightOfTree(tree) - 1;
		int level = 0;
		while (level <= max) {
			System.out.println("\n at level: " + level);
			elementAtLevel(tree, 0, level);

			level++;
		}
	}

	/*
	 * efficient searching algorithm O(1)
	 */
	public static void levelOrderTransversal(BinaryTreeNode tree) {
		if (tree == null)
			return;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

		q.add(tree);
		while (q.isEmpty() == false) {
			int count = q.size();
			System.out.println("\n");
			for (int i = 0; i < count; i++) {
				BinaryTreeNode cur = q.poll();
				System.out.print(cur.key + " ");
				if (cur.left != null) {
					q.add(cur.left);
				}
				if (cur.right != null) {
					q.add(cur.right);
				}
			}
		}
	}

	public static void main(String[] args) {

		BinaryTreeNode root = new BinaryTreeNode(10);
		root.left = new BinaryTreeNode(20);
		root.left.right = new BinaryTreeNode(25);
		root.right = new BinaryTreeNode(30);
		root.left.left = new BinaryTreeNode(40);
		System.out.println("inorder transversal");
		inorderTraversal(root);
		System.out.println("height: " + heightOfTree(root));
		System.out.println("printing elements at level");
		elementAtLevel(root, 0, 2);
		System.out.println("\n" + "printing transverse elements: ");
		levelOrderTransversalRecursive(root);
		System.out.println("\n non recursive lateral search:");
		levelOrderTransversal(root);
	}

}

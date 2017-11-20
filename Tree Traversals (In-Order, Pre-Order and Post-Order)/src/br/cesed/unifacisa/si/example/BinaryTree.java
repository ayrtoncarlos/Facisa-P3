package br.cesed.unifacisa.si.example;

/**
 * The class representing a binary tree.
 * 
 * @author Ayrton Carlos
 *
 */
public class BinaryTree {

	private Node root; // The root node.

	/**
	 * Class Builder.
	 */
	public BinaryTree() {

		this.root = null;
	}

	/**
	 * Wrappers over recursive function printPostorder().
	 */
	public void printPostOrder() {

		printPostOrder(this.root);
	}

	/**
	 * Wrappers over recursive function printPreOrder().
	 */
	public void printPreOrder() {

		printPreOrder(this.root);
	}

	/**
	 * Wrappers over recursive function printInOrder().
	 */
	public void printInOrder() {

		printInOrder(this.root);
	}

	/**
	 * The function that returns the root node.
	 * 
	 * @return Node - The root node.
	 */
	public Node getRoot() {

		return root;
	}

	/**
	 * The function that receives and modifies the root node.
	 * 
	 * @param root
	 *            Node - The root node.
	 */
	public void setRoot(Node root) {

		this.root = root;
	}

	/**
	 * The function that print the tree in Post-Order.
	 * 
	 * @param node
	 *            Node - The binary tree node.
	 */
	public void printPostOrder(Node node) {

		if (node == null) {

			return;
		}

		// first recur on left subtree.
		printPostOrder(node.getLeft());

		// then recur on right subtree.
		printPostOrder(node.getRight());

		// Now print the node.
		System.out.print(node.getValue() + " ");
	}

	/**
	 * The function that print the tree in Pre-Order.
	 * 
	 * @param node
	 *            Node - The binary tree node.
	 */
	public void printPreOrder(Node node) {

		if (node == null) {

			return;
		}

		// First print the node.
		System.out.print(node.getValue() + " ");

		// then recur on left subtree.
		printPreOrder(node.getLeft());

		// finally, refer to the right subtree.
		printPreOrder(node.getRight());
	}

	/**
	 * The function that print the tree in In-Order.
	 * 
	 * @param node
	 *            Node - The binary tree node.
	 */
	public void printInOrder(Node node) {

		if (node == null) {

			return;
		}

		// first recur on left subtree.
		printInOrder(node.getLeft());

		// then print the node.
		System.out.print(node.getValue() + " ");

		// finally, refer to the right subtree.
		printInOrder(node.getRight());
	}

}

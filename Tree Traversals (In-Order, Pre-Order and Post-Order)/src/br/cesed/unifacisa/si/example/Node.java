package br.cesed.unifacisa.si.example;

/**
 * Class containing left and right child of current node and key value.
 * 
 * @author Ayrton Carlos
 *
 */
public class Node {

	private int value; // The value of the key.
	private Node left; // The left node.
	private Node right; // The right node.

	/**
	 * Class Builder.
	 * 
	 * @param value
	 *            int - The value of the key.
	 */
	public Node(int value) {

		this.value = value;
		this.left = null;
		this.right = null;
	}

	/**
	 * The function to return the value of the key.
	 * 
	 * @return int - The value of the key.
	 */
	public int getValue() {

		return value;
	}

	/**
	 * The function that receives and modifies the key value.
	 * 
	 * @param value
	 *            int - The value of the key.
	 */
	public void setValue(int value) {

		this.value = value;
	}

	/**
	 * The function that returns the left node.
	 * 
	 * @return Node - The left node.
	 */
	public Node getLeft() {

		return left;
	}

	/**
	 * The function that receives and modifies the left node.
	 * 
	 * @param left
	 *            Node - The left node.
	 */
	public void setLeft(Node left) {

		this.left = left;
	}

	/**
	 * The function that returns the right node.
	 * 
	 * @return Node - The right node.
	 */
	public Node getRight() {

		return right;
	}

	/**
	 * The function that receives and modifies the right node.
	 * 
	 * @param right
	 *            Node - The right node.
	 */
	public void setRight(Node right) {

		this.right = right;
	}
}

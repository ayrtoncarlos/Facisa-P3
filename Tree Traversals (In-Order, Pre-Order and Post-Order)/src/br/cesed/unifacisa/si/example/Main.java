package br.cesed.unifacisa.si.example;

/**
 * Main class of binary tree.
 * 
 * @author Ayrton Carlos
 *
 */
public class Main {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.setRoot(new Node(1));
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		tree.getRoot().getLeft().setLeft(new Node(4));
		tree.getRoot().getLeft().setRight(new Node(5));

		System.out.print("Pre-Order traversal of binary tree is: ");
		tree.printPreOrder();

		System.out.print("\n\nIn-Order traversal of binary tree is: ");
		tree.printInOrder();

		System.out.print("\n\nPost-Order traversal of binary tree is: ");
		tree.printPostOrder();
	}
}

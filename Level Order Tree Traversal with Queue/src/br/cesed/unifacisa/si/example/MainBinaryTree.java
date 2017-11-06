package br.cesed.unifacisa.si.example;

public class MainBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree tree_level = new BinaryTree();
		
		tree_level.root = new Node(0);
		tree_level.root.left = new Node(4);
		tree_level.root.right = new Node(2);
		tree_level.root.left.left = new Node(1);
		tree_level.root.left.right = new Node(3);
		
		System.out.print("Level order traversal of binary tree is - ");
		tree_level.printLevelOrder();
	}
}

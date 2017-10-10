package br.cesed.unifacisa.si.example;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	void printLevelOrder() {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {

			Node tempNode = queue.poll();
			System.out.println(tempNode.data + " ");

			if (tempNode.left != null) {

				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {

				queue.add(tempNode.right);
			}
		}
	}
}

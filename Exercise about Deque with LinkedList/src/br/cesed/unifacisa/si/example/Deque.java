package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Represents a simple example of implementing a Deque with Linked List.
 */
public class Deque {

	private NodeDeque firstNode;
	private int inserted = 0;

	/**
	 * constructor of class.
	 *
	 */
	public Deque() {

		this.firstNode = null;
	}

	/**
	 * Adds a node at the beginning of the linked list.
	 * 
	 * @param value
	 */
	public void addFirstNode(String value) {

		if (this.firstNode == null) {

			this.firstNode = new NodeDeque(value);
			inserted++;

		} else {

			NodeDeque newNode = new NodeDeque(value);
			newNode.nextNode = this.firstNode;
			this.firstNode = newNode;
			inserted++;
		}
	}

	/**
	 * Removes the start node from the linked list.
	 * 
	 * @return the node that was removed.
	 */
	public String removeFirstNode() {

		if (!(this.firstNode == null)) {

			NodeDeque node = this.firstNode;
			this.firstNode = this.firstNode.getNext();
			inserted--;
			return node.getValue();

		} else {

			return null;
		}
	}

	/**
	 * Adds a node at the end of the linked list.
	 * 
	 * @param value
	 */
	public void addLastNode(String value) {

		if (this.firstNode == null) {

			this.firstNode = new NodeDeque(value);
			inserted++;

		} else {

			NodeDeque actual = this.firstNode;

			while (actual.nextNode != null) {

				actual = actual.nextNode;
			}

			actual.nextNode = new NodeDeque(value);
			inserted++;
		}
	}

	/**
	 * Removes the node from the end of the linked list
	 * 
	 * @return the node that was removed.
	 */
	public String removeLastNode() {

		if (!(this.firstNode == null)) {

			NodeDeque node = this.firstNode;

			for (int i = 0; i < inserted - 2; i++) {

				node = node.getNext();
			}
			NodeDeque newNode = node.getNext();
			node.nextNode = null;
			inserted--;
			return newNode.getValue();

		} else {

			return null;
		}
	}

	/**
	 * @return the size of the linked list.
	 */
	public int getSize() {

		return inserted;
	}

	/**
	 * @return the first node in the linked list.
	 */
	public String getFirstNode() {

		if (!(this.firstNode == null)) {

			return this.firstNode.getValue();
		}

		return null;
	}

	/**
	 * @return the last node in the linked list.
	 */
	public String getLastNode() {

		if (!(this.firstNode == null)) {

			NodeDeque node = this.firstNode;

			for (int i = 0; i < inserted - 1; i++) {

				node = node.getNext();
			}
			return node.getValue();
		}

		return null;
	}

}

package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Represents a simple example of implementing a Deque with Linked List.
 */
public class NodeDeque {

	private String value;
	protected NodeDeque nextNode;

	/**
	 * constructor of class.
	 * 
	 * @param value
	 */
	public NodeDeque(String value) {

		this.value = value;
		this.nextNode = null;
	}

	/**
	 * @return the value of the linked list node.
	 */
	public String getValue() {

		return this.value;
	}

	/**
	 * Receive the next node in the linked list.
	 * 
	 * @param next
	 */
	public void setNext(NodeDeque next) {

		this.nextNode = next;
	}

	/**
	 * @return the next node in the linked list.
	 */
	public NodeDeque getNext() {

		return this.nextNode;
	}

}

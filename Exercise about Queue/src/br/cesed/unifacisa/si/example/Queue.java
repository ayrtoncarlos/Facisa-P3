package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Represents a simple implementation of a queue in Java.
 */

public class Queue {

	private static final int INITIAL_SIZE = 3;
	private static final int INITIAL_POSITION = 0;
	Object[] arrayQueue = new Object[INITIAL_SIZE];
	private int inserted = 0;

	/**
	 * Constructor of class.
	 *
	 */
	public Queue() {

	}

	/**
	 * Adds element to queue.
	 * 
	 * @param o
	 */
	public void addElement(Object o) {

		if (o == null) {

			throw new IllegalArgumentException();

		} else if (inserted == arrayQueue.length) {

			internArrayOverflow();

		}
		arrayQueue[inserted] = o;
		inserted++;
	}

	/**
	 * @return new array if array capacity exceeds.
	 */
	private Object[] internArrayOverflow() {

		Object[] newArrayQueue = new Object[arrayQueue.length * 2];

		for (int i = 0; i < arrayQueue.length; i++) {

			newArrayQueue[i] = arrayQueue[i];
		}

		return arrayQueue = newArrayQueue;

	}

	/**
	 * Remove element from queue.
	 * 
	 * @return the element removed.
	 */
	public Object removeElement() {

		if (!isEmpty()) {

			Object o = arrayQueue[INITIAL_POSITION];

			for (int i = 0; i < inserted - 1; i++) {

				arrayQueue[i] = arrayQueue[i + 1];
			}
			arrayQueue[inserted - 1] = null;
			inserted--;
			return o;

		} else {

			return null;
		}
	}

	/**
	 * Check if array is empty.
	 * 
	 * @return true or false.
	 */
	private boolean isEmpty() {

		return arrayQueue.length == 0;
	}

	/**
	 * @return the value of the first element of the queue.
	 */
	public Object getFirst() {

		if (!(isEmpty())) {

			return arrayQueue[INITIAL_POSITION];

		} else {

			return null;
		}
	}

	/**
	 * @return queue size.
	 */
	public int getSize() {

		return inserted;
	}
}

package br.cesed.unifacisa.si.example;

/**
 * Represents a simple implementation of a queue in Java.
 * 
 * @author Ayrton Carlos
 *
 */

public class Queue {

	private static final int INITIAL_SIZE = 3;
	private static final int INITIAL_POSITION = 0;
	Object[] arrayQueue = new Object[INITIAL_SIZE];
	private int inserted = 0;

	/**
	 * Class Builder.
	 *
	 */
	public Queue() {

	}

	/**
	 * The function that adds element to queue.
	 * 
	 * @param o
	 *            Object - The element to add in queue.
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
	 * The function that returns a new array with greater capacity and with all the
	 * data from the previous array.
	 * 
	 * @return Object[] - New array if array capacity exceeds.
	 */
	private Object[] internArrayOverflow() {

		Object[] newArrayQueue = new Object[arrayQueue.length * 2];

		for (int i = 0; i < arrayQueue.length; i++) {

			newArrayQueue[i] = arrayQueue[i];
		}

		return arrayQueue = newArrayQueue;

	}

	/**
	 * The function that remove element from queue.
	 * 
	 * @return Object - The element removed.
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
	 * The function that check if array is empty.
	 * 
	 * @return boolean - true or false.
	 */
	private boolean isEmpty() {

		return arrayQueue.length == 0;
	}

	/**
	 * The function that returns the first of the queue.
	 * 
	 * @return Object - The value of the first element of the queue.
	 */
	public Object getFirst() {

		if (!(isEmpty())) {

			return arrayQueue[INITIAL_POSITION];

		} else {

			return null;
		}
	}

	/**
	 * The function that returns the queue size.
	 * 
	 * @return int - Queue size.
	 */
	public int getSize() {

		return inserted;
	}

}

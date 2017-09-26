package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Represents a simple implementation of a Deque in Java.
 */
public class Deque {

	private static final int INITIAL_SIZE = 3;
	private static final int INITIAL_POSITION = 0;
	Object[] arrayDeque = new Object[INITIAL_SIZE];
	private int inserted = 0;

	/**
	 * Constructor of class.
	 *
	 */
	public Deque() {

	}

	/**
	 * Add element at the beginning of the deque.
	 * 
	 * @param o
	 */
	public void addFirst(Object o) {

		if (o == null) {

			throw new IllegalArgumentException();
		}

		else if (inserted == arrayDeque.length) {

			internArrayOverflow();

		}

		for (int i = inserted; i > 0; i--) {

			arrayDeque[i] = arrayDeque[i - 1];
		}

		arrayDeque[INITIAL_POSITION] = o;
		inserted++;

	}

	/**
	 * Add element at end of deque.
	 * 
	 * @param o
	 */
	public void addLast(Object o) {

		if (o == null) {

			throw new IllegalArgumentException();
		}

		else if (inserted == arrayDeque.length) {

			internArrayOverflow();

		}

		arrayDeque[inserted] = o;
		inserted++;
	}

	/**
	 * @return new array if array capacity exceeds.
	 */
	private Object[] internArrayOverflow() {

		Object[] newArrayDeque = new Object[arrayDeque.length * 2];

		for (int i = 0; i < arrayDeque.length; i++) {

			newArrayDeque[i] = arrayDeque[i];
		}

		return arrayDeque = newArrayDeque;

	}

	/**
	 * Removes the first element from deque.
	 * 
	 * @return the removed element.
	 */
	public Object removeFirst() {

		if (!isEmpty()) {

			Object o = arrayDeque[INITIAL_POSITION];
			arrayDeque[INITIAL_POSITION] = null;

			for (int i = 0; i < inserted - 1; i++) {

				arrayDeque[i] = arrayDeque[i + 1];
			}
			arrayDeque[inserted - 1] = null;
			inserted--;
			return o;

		} else {

			return null;
		}

	}

	/**
	 * Removes the last element from the deque.
	 * 
	 * @return the removed element.
	 */
	public Object removeLast() {

		if (!isEmpty()) {

			Object o = arrayDeque[inserted - 1];
			arrayDeque[inserted - 1] = null;
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

		return arrayDeque.length == 0;
	}

	/**
	 * @return the first element of the deque.
	 */
	public Object getFirst() {

		if (!(isEmpty())) {

			return arrayDeque[INITIAL_POSITION];

		} else {

			return null;
		}
	}

	/**
	 * @return the last element of the deque.
	 */
	public Object getLast() {

		if (!isEmpty()) {

			return arrayDeque[inserted - 1];

		} else {

			return null;
		}
	}

	/**
	 * @return deque size.
	 */
	public int getSize() {

		return inserted;
	}
}

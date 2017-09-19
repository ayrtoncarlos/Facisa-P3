package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Represents a simple example of implementing a Deque.
 * @param <E>
 */
public class Deque<E> {

	private static final int INITIAL_POSITION = 0;
	private E[] arrayDeque;
	private int inserted = 0;

	public Deque(int size) {

		arrayDeque = (E[]) new Object[size];
	}

	/**
	 * Add element at start of array.
	 * 
	 * @param value
	 * @throws DequeFullException
	 */
	public void addFirst(E value) throws DequeFullException {

		if (inserted == arrayDeque.length) {

			throw new DequeFullException("Your array is full!");
		}

		for (int i = inserted; i > 0; i--) {

			arrayDeque[i] = arrayDeque[i - 1];
		}
		arrayDeque[INITIAL_POSITION] = value;
		inserted++;
	}

	/**
	 * Add element at end of array.
	 * 
	 * @param value
	 * @throws DequeFullException
	 */
	public void addLast(E value) throws DequeFullException {

		if (inserted == arrayDeque.length) {

			throw new DequeFullException("Your array is full!");

		}

		arrayDeque[inserted] = value;
		inserted++;
	}

	/**
	 * Remove element from array start.
	 * 
	 * @return
	 */
	public E removeFirst() {

		E value = arrayDeque[INITIAL_POSITION];

		for (int i = 0; i < inserted - 1; i++) {

			arrayDeque[i] = arrayDeque[i + 1];
		}
		inserted--;
		return value;
	}

	/**
	 * Remove element from end of array.
	 * 
	 * @return
	 */
	public E removeLast() {

		E value = arrayDeque[inserted];
		inserted--;
		return value;
	}

	/**
	 * Returns the first element of the array.
	 * 
	 * @return
	 */
	public E getFirst() {

		return arrayDeque[INITIAL_POSITION];
	}

	/**
	 * Returns the last element of the array.
	 * 
	 * @return
	 */
	public E getLast() {

		return arrayDeque[inserted - 1];
	}

	/**
	 * Returns the size of the array.
	 * 
	 * @return
	 */
	public int getSize() {

		return inserted;
	}
}

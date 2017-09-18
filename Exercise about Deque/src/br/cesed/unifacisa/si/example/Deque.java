package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 */

public class Deque {

	private static final int INITIAL_SIZE = 3;
	private static final int INITIAL_POSITION = 0;
	Object[] arrayDeque = new Object[INITIAL_SIZE];
	private int inserted = 0;

	public Deque() {

	}

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

	private Object[] internArrayOverflow() {

		Object[] newArrayDeque = new Object[arrayDeque.length * 2];

		for (int i = 0; i < arrayDeque.length; i++) {

			newArrayDeque[i] = arrayDeque[i];
		}

		return arrayDeque = newArrayDeque;

	}

	public Object removeFirst() {

		Object o = arrayDeque[INITIAL_POSITION];
		arrayDeque[INITIAL_POSITION] = null;

		for (int i = 0; i < inserted-1; i++) {

			arrayDeque[i] = arrayDeque[i + 1];
		}
		inserted--;
		return o;
	}

	public Object removeLast() {

		Object o = arrayDeque[inserted - 1];
		arrayDeque[inserted - 1] = null;
		inserted--;
		return o;
	}

	public Object getFirst() {

		return arrayDeque[INITIAL_POSITION];
	}

	public Object getLast() {

		return arrayDeque[inserted - 1];
	}

	public int getSize() {

		return inserted;
	}
}

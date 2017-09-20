package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 */

public class Queue {

	private static final int INITIAL_SIZE = 3;
	private static final int INITIAL_POSITION = 0;
	Object[] arrayQueue = new Object[INITIAL_SIZE];
	private int inserted = 0;

	public Queue() {

	}

	public void addElement(Object o) {

		if (o == null) {

			throw new IllegalArgumentException();

		} else if (inserted == arrayQueue.length) {

			internArrayOverflow();

		}
		arrayQueue[inserted] = o;
		inserted++;
	}

	private Object[] internArrayOverflow() {

		Object[] newArrayQueue = new Object[arrayQueue.length * 2];

		for (int i = 0; i < arrayQueue.length; i++) {

			newArrayQueue[i] = arrayQueue[i];
		}

		return arrayQueue = newArrayQueue;

	}

	public Object removeElement() {

		if (!isEmpty()) {

			Object o = arrayQueue[INITIAL_POSITION];

			for (int i = 0; i < inserted - 1; i++) {

				arrayQueue[i] = arrayQueue[i + 1];
			}
			arrayQueue[inserted-1] = null;
			inserted--;
			return o;

		} else {

			return null;
		}
	}

	private boolean isEmpty() {

		return arrayQueue.length == 0;
	}

	public Object getFirst() {

		return arrayQueue[INITIAL_POSITION];
	}

	public int getSize() {

		return inserted;
	}
}

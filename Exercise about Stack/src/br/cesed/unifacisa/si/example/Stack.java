package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 */

public class Stack {

	private static final int INITIAL_SIZE = 3;
	private static final int INITIAL_POSITION = 0;
	Object[] arrayStack = new Object[INITIAL_SIZE];
	private int inserted = 0;

	public Stack() {

	}

	public void addStack(Object o) {

		if (o == null) {

			throw new IllegalArgumentException();

		} else if (inserted == arrayStack.length) {

			internArrayOverflow();

		}
		for (int i = inserted; i > 0; i--) {

			arrayStack[i] = arrayStack[i - 1];
		}

		arrayStack[INITIAL_POSITION] = o;
		inserted++;

	}

	private Object[] internArrayOverflow() {

		Object[] newArrayQueue = new Object[arrayStack.length * 2];

		for (int i = 0; i < arrayStack.length; i++) {

			newArrayQueue[i] = arrayStack[i];
		}

		return arrayStack = newArrayQueue;
	}

	public Object removeTop() {

		if (!isEmpty()) {

			Object o = arrayStack[INITIAL_POSITION];
			arrayStack[INITIAL_POSITION] = null;

			for (int i = 0; i < inserted - 1; i++) {

				arrayStack[i] = arrayStack[i + 1];
			}
			arrayStack[inserted-1] = null;
			inserted--;
			return o;

		} else {

			return null;
		}
	}

	private boolean isEmpty() {

		return getSize() == 0;
	}

	public Object getTop() {

		return arrayStack[INITIAL_POSITION];
	}

	public int getSize() {

		return inserted;
	}

}

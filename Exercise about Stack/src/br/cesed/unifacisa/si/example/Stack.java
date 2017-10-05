package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Represents a simple implementation of a stack in Java.
 */

public class Stack {

	private static final int INITIAL_SIZE = 3;
	private static final int INITIAL_POSITION = 0;
	Object[] arrayStack = new Object[INITIAL_SIZE];
	private int inserted = 0;

	/**
	 * Constructor of class.
	 *
	 */
	public Stack() {

	}

	/**
	 * Add element to stack.
	 * 
	 * @param o
	 */
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

	/**
	 * @return new array if array capacity exceeds.
	 */
	private Object[] internArrayOverflow() {

		Object[] newArrayStack = new Object[arrayStack.length * 2];

		for (int i = 0; i < arrayStack.length; i++) {

			newArrayStack[i] = arrayStack[i];
		}

		return arrayStack = newArrayStack;
	}

	/**
	 * Remove element from top of stack.
	 * 
	 * @return the removed element.
	 */
	public Object removeTop() {

		if (!isEmpty()) {

			Object o = arrayStack[INITIAL_POSITION];
			arrayStack[INITIAL_POSITION] = null;

			for (int i = 0; i < inserted - 1; i++) {

				arrayStack[i] = arrayStack[i + 1];
			}
			arrayStack[inserted - 1] = null;
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

		return getSize() == 0;
	}

	/**
	 * @return the top-of-stack element.
	 */
	public Object getTop() {

		if (!(isEmpty())) {

			return arrayStack[INITIAL_POSITION];

		} else {

			return null;
		}
	}

	/**
	 * @return the stack size.
	 */
	public int getSize() {

		return inserted;
	}

}

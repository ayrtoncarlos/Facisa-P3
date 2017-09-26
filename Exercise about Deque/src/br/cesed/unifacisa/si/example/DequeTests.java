package br.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Represents multiple tests with JUnit 4.
 */

public class DequeTests {

	@Test
	public void testAddFirst1() {

		Deque arrayDeque = new Deque();

		arrayDeque.addFirst(3);
		arrayDeque.addFirst(2);
		arrayDeque.addFirst(1);

		assertEquals(3, arrayDeque.getSize());
	}

	@Test
	public void testAddFirst2() {

		Deque arrayDeque = new Deque();

		arrayDeque.addFirst('N');
		arrayDeque.addFirst('O');
		arrayDeque.addFirst('T');
		arrayDeque.addFirst('R');
		arrayDeque.addFirst('Y');
		arrayDeque.addFirst('A');

		assertEquals(6, arrayDeque.getSize());
	}

	@Test
	public void testAddFirstAndAddLast() {

		Deque arrayDeque = new Deque();

		arrayDeque.addFirst('N');
		arrayDeque.addFirst('O');
		arrayDeque.addLast('T');
		arrayDeque.addFirst('R');
		arrayDeque.addLast('Y');
		arrayDeque.addFirst('A');

		assertEquals('Y', arrayDeque.getLast());
	}

	@Test
	public void testRemoveFirst1() {

		Deque arrayDeque = new Deque();

		arrayDeque.addFirst(3);
		arrayDeque.addFirst(2);
		arrayDeque.addFirst(1);

		assertEquals(1, arrayDeque.removeFirst());
	}

	@Test
	public void testRemoveFirst2() {

		Deque arrayDeque = new Deque();

		arrayDeque.addFirst('N');
		arrayDeque.addFirst('O');
		arrayDeque.addFirst('T');
		arrayDeque.addFirst('R');
		arrayDeque.removeFirst();
		arrayDeque.addFirst('Y');
		arrayDeque.addFirst('A');

		assertEquals('A', arrayDeque.removeFirst());
	}

	@Test
	public void testAddLast1() {

		Deque arrayDeque = new Deque();

		arrayDeque.addLast('A');
		arrayDeque.addLast('Y');
		arrayDeque.addLast('R');
		arrayDeque.addLast('T');
		arrayDeque.addLast('O');
		arrayDeque.addLast('N');

		assertEquals(6, arrayDeque.getSize());
	}

	@Test
	public void testAddLast2() {

		Deque arrayDeque = new Deque();

		arrayDeque.addLast(1);
		arrayDeque.addLast(2);
		arrayDeque.addLast(3);

		assertEquals(3, arrayDeque.getSize());
	}

	@Test
	public void testRemoveLast1() {

		Deque arrayDeque = new Deque();

		arrayDeque.addLast('A');
		arrayDeque.addLast('Y');
		arrayDeque.addLast('R');
		arrayDeque.addLast('T');
		arrayDeque.addLast('O');
		arrayDeque.addLast('N');

		assertEquals('N', arrayDeque.removeLast());
	}

	@Test
	public void testRemoveLast2() {

		Deque arrayDeque = new Deque();

		arrayDeque.addLast(1);
		arrayDeque.addLast(2);
		arrayDeque.addLast(3);

		assertEquals(3, arrayDeque.removeLast());
	}

	@Test
	public void testGetFirst1() {

		Deque arrayDeque = new Deque();

		arrayDeque.addFirst(1);

		assertEquals(1, arrayDeque.getFirst());
	}

	@Test
	public void testGetFirst2() {

		Deque arrayDeque = new Deque();

		assertEquals(null, arrayDeque.getFirst());
	}

	@Test
	public void testGetLast1() {

		Deque arrayDeque = new Deque();

		arrayDeque.addLast('A');

		assertEquals('A', arrayDeque.getFirst());
	}

	@Test
	public void testGetLast2() {

		Deque arrayDeque = new Deque();

		assertEquals(null, arrayDeque.getFirst());
	}

}

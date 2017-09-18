package br.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 */

public class DequeTests {

	@Test
	public void testInsertFirst1() {

		Deque arrayDeque = new Deque();

		arrayDeque.addFirst(3);
		arrayDeque.addFirst(2);
		arrayDeque.addFirst(1);

		assertEquals(3, arrayDeque.getSize());
	}
	
	@Test
	public void testInsertFirst2() {

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
		arrayDeque.addFirst('Y');
		arrayDeque.addFirst('A');

		assertEquals('A', arrayDeque.removeFirst());
	}
	
	@Test
	public void testInsertLast1(){
		
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
	public void testInsertLast2(){
		
		Deque arrayDeque = new Deque();
		
		arrayDeque.addLast(1);
		arrayDeque.addLast(2);
		arrayDeque.addLast(3);

		assertEquals(3, arrayDeque.getSize());
	}
	
	@Test
	public void testRemoveLast1(){
		
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
	public void testRemoveLast2(){
		
		Deque arrayDeque = new Deque();
		
		arrayDeque.addLast(1);
		arrayDeque.addLast(2);
		arrayDeque.addLast(3);

		assertEquals(3, arrayDeque.removeLast());
	}

}
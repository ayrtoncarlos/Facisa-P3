package br.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 */

public class QueueTests {

	@Test
	public void testAddElement1() {
		
		Queue arrayQueue = new Queue();
		
		arrayQueue.addElement('A');
		arrayQueue.addElement('B');
		arrayQueue.addElement('C');
		
		assertEquals(3, arrayQueue.getSize());

	}
	
	@Test
	public void testAddElement2() {
		
		Queue arrayQueue = new Queue();
		
		arrayQueue.addElement(3);
		arrayQueue.addElement(2);
		arrayQueue.addElement(1);
		
		assertEquals(3, arrayQueue.getSize());

	}
	
	@Test
	public void testRemoveElement1() {
		
		Queue arrayQueue = new Queue();
		
		arrayQueue.addElement('A');
		arrayQueue.addElement('B');
		arrayQueue.addElement('C');
		arrayQueue.addElement('D');
		arrayQueue.addElement('E');
		arrayQueue.removeElement();
		
		assertEquals(4, arrayQueue.getSize());

	}
	
	@Test
	public void testRemoveElement2() {
		
		Queue arrayQueue = new Queue();
		
		arrayQueue.addElement('A');
		arrayQueue.addElement('B');
		arrayQueue.addElement('C');
		
		assertEquals('A', arrayQueue.removeElement());

	}
	
	@Test
	public void testGetFirst() {
		
		Queue arrayQueue = new Queue();
		
		arrayQueue.addElement('A');
		arrayQueue.addElement('B');
		arrayQueue.addElement('C');
		arrayQueue.getFirst();
		
		assertEquals('A', arrayQueue.getFirst());

	}
	
	@Test
	public void testGetSize() {
		
		Queue arrayQueue = new Queue();
		
		arrayQueue.addElement('A');
		arrayQueue.addElement('B');
		arrayQueue.addElement('C');
		
		assertEquals(3, arrayQueue.getSize());

	}

}

package br.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 */

public class StackTests {

	@Test
	public void testAddStack1() {
		
		Stack arrayStack = new Stack();
		
		arrayStack.addStack('C');
		arrayStack.addStack('B');
		arrayStack.addStack('A');
		
		assertEquals(3, arrayStack.getSize());
		
	}
	
	@Test
	public void testAddStack2() {
		
		Stack arrayStack = new Stack();
		
		arrayStack.addStack('A');
		arrayStack.addStack('Y');
		arrayStack.addStack('R');
		arrayStack.addStack('T');
		arrayStack.addStack('O');
		arrayStack.addStack('N');
		
		assertEquals(6, arrayStack.getSize());
		
	}
	
	@Test
	public void testRemoveTop1() {
		
		Stack arrayStack = new Stack();
		
		arrayStack.addStack('N');
		arrayStack.addStack('O');
		arrayStack.addStack('T');
		arrayStack.addStack('R');
		arrayStack.addStack('Y');
		arrayStack.addStack('A');
		
		assertEquals('A', arrayStack.removeTop());
		
	}
	
	@Test
	public void testRemoveTop2() {
		
		Stack arrayStack = new Stack();
		
		arrayStack.addStack('C');
		arrayStack.addStack('B');
		arrayStack.addStack('A');
		
		assertEquals('A', arrayStack.removeTop());
		
	}
	
	@Test
	public void testGetTop1() {
		
		Stack arrayStack = new Stack();
		
		arrayStack.addStack('C');
		arrayStack.addStack('B');
		arrayStack.addStack('A');
		
		assertEquals('A', arrayStack.getTop());
		
	}
	
	@Test
	public void testGetTop2() {
		
		Stack arrayStack = new Stack();
		
		arrayStack.addStack('A');
		arrayStack.addStack('B');
		arrayStack.addStack('C');
		
		assertEquals('C', arrayStack.getTop());
		
	}
	
	@Test
	public void testGetSize(){
		
		Stack arrayStack = new Stack();
		
		arrayStack.addStack('A');
		arrayStack.addStack('B');
		arrayStack.addStack('C');
		
		assertEquals(3, arrayStack.getSize());
	}

}

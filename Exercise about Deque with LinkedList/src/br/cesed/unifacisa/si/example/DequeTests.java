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
	public void testAddFirstNode1() {

		Deque node = new Deque();

		node.addFirstNode("Ayrton");
		node.addFirstNode("Felipe");
		node.addFirstNode("Mateus");

		assertEquals(3, node.getSize());
	}

	@Test
	public void testAddFirstNode2() {

		Deque node = new Deque();

		assertEquals(null, node.getFirstNode());
	}

	@Test
	public void testAddFirstNode3() {

		Deque node = new Deque();

		node.addFirstNode("Ayrton");

		assertEquals("Ayrton", node.getFirstNode());
	}

	@Test
	public void testAddFirstNode4() {

		Deque node = new Deque();

		node.addFirstNode("Ayrton");
		node.addFirstNode("Felipe");

		assertEquals("Felipe", node.getFirstNode());
	}

	@Test
	public void testRemoveFirstNode1() {

		Deque node = new Deque();

		node.addFirstNode("Ayrton");
		node.addFirstNode("Felipe");
		node.addFirstNode("Mateus");
		node.addFirstNode("Szabo");
		node.removeFirstNode();

		assertEquals("Mateus", node.getFirstNode());

	}

	@Test
	public void testRemoveFirstNode2() {

		Deque node = new Deque();

		node.removeFirstNode();

		assertEquals(null, node.getFirstNode());

	}

	@Test
	public void testRemoveFirstNode3() {

		Deque node = new Deque();

		node.addFirstNode("Ayrton");
		node.removeFirstNode();

		assertEquals(null, node.getFirstNode());

	}

	@Test
	public void testAddLastNode1() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Felipe");
		node.addLastNode("Malheiros");

		assertEquals("Ayrton", node.getFirstNode());

	}

	@Test
	public void testAddLastNode2() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Felipe");
		node.addFirstNode("Malheiros");

		assertEquals("Malheiros", node.getFirstNode());

	}

	@Test
	public void testAddLastNode3() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Felipe");
		node.addFirstNode("Malheiros");
		node.addLastNode("Joel");

		assertEquals("Joel", node.getLastNode());

	}

	@Test
	public void testRemoveLastNode1() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Felipe");
		node.addFirstNode("Malheiros");

		assertEquals("Malheiros", node.removeFirstNode());

	}

	@Test
	public void testRemoveLastNode2() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Felipe");

		assertEquals("Felipe", node.removeLastNode());

	}

	@Test
	public void testRemoveLastNode3() {

		Deque node = new Deque();

		node.addFirstNode("Joel");
		node.addLastNode("Ayrton");
		node.addLastNode("Felipe");

		assertEquals("Felipe", node.removeLastNode());

	}

	@Test
	public void testGetSize1() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Felipe");

		assertEquals(2, node.getSize());

	}

	@Test
	public void testGetSize2() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addFirstNode("Joel");
		node.addLastNode("Felipe");

		assertEquals(3, node.getSize());

	}

	@Test
	public void testGetSize3() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addFirstNode("Joel");
		node.addLastNode("Felipe");
		node.removeLastNode();

		assertEquals(2, node.getSize());

	}

	@Test
	public void testGetFirstNode1() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addFirstNode("Joel");
		node.addLastNode("Felipe");
		node.removeLastNode();

		assertEquals("Joel", node.getFirstNode());

	}

	@Test
	public void testGetFirstNode2() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Malheiros");
		node.addFirstNode("Joel");
		node.addLastNode("Felipe");
		node.removeLastNode();
		node.removeFirstNode();

		assertEquals("Ayrton", node.getFirstNode());

	}

	@Test
	public void testGetLastNode1() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Malheiros");
		node.addFirstNode("Joel");
		node.addLastNode("Felipe");
		node.removeLastNode();
		node.removeFirstNode();

		assertEquals("Malheiros", node.getLastNode());

	}

	@Test
	public void testGetLastNode2() {

		Deque node = new Deque();

		node.addLastNode("Ayrton");
		node.addLastNode("Mateus");
		node.addLastNode("Malheiros");
		node.addFirstNode("Joel");
		node.addLastNode("Felipe");
		node.removeLastNode();
		node.removeFirstNode();
		node.removeLastNode();

		assertEquals("Mateus", node.getLastNode());

	}

}

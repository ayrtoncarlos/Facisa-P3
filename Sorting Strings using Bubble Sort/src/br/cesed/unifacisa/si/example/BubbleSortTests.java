package br.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Bubble Sort Algorithm Test.
 */
public class BubbleSortTests {

	@Test
	public void testIsOrdered1() {

		String array[] = { "Felipe", "Ayrton", "Mateus" };
		BubbleSort.sortStrings(array);

		assertEquals(array[0], "Ayrton");
		assertEquals(array[1], "Felipe");
		assertEquals(array[2], "Mateus");
	}

	@Test
	public void testIsOrdered2() {

		String array[] = { "Felipe", "Ayrton", "Mateus", "Ana", "Robinho",
				"José", "Onildo" };
		BubbleSort.sortStrings(array);

		assertEquals(array[0], "Ana");
		assertEquals(array[1], "Ayrton");
		assertEquals(array[2], "Felipe");
		assertEquals(array[3], "José");
		assertEquals(array[4], "Mateus");
		assertEquals(array[5], "Onildo");
		assertEquals(array[6], "Robinho");
	}

	@Test
	public void testEmptyArray() {

		String array[] = {};
		BubbleSort.sortStrings(array);

		assertEquals(array.length, 0);
	}

}

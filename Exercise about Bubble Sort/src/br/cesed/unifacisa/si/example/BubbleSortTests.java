package br.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 * 
 *         Bubble Sort Algorithm Test.
 *
 */
public class BubbleSortTests {

	@Test
	public void testIsOrdered1() {

		int array[] = { 1, 3, 2 };
		BubbleSort.bubbleSort(array);

		assertEquals(array[0], 1);
		assertEquals(array[1], 2);
		assertEquals(array[2], 3);
	}

	@Test
	public void testIsOrdered2() {

		int array[] = { 1, 3, 2, 7, 10, 44, 5, 9 };
		BubbleSort.bubbleSort(array);

		assertEquals(array[0], 1);
		assertEquals(array[1], 2);
		assertEquals(array[2], 3);
		assertEquals(array[3], 5);
		assertEquals(array[4], 7);
		assertEquals(array[5], 9);
		assertEquals(array[6], 10);
		assertEquals(array[7], 44);
	}

	@Test
	public void testEmptyArray() {

		int array[] = {};
		BubbleSort.bubbleSort(array);

		assertEquals(array.length, 0);
	}

}

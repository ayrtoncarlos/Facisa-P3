package br.cesed.unifacisa.si.example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 *         QuickSort sorting algorithm tests with JUnit 5.
 */
class QuickSortTests {

	@Test
	public void testIsOrdered1() {

		int array[] = { 1, 3, 2, 7, 10, 44, 5, 9 };
		QuickSort.quickSort(array);

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
	public void testIsOrdered2() {

		int array[] = { 222, 20, 1, 3, 2, 99, 7, 10, 44, 5, 9, -1 };
		QuickSort.quickSort(array);

		assertEquals(array[0], -1);
		assertEquals(array[1], 1);
		assertEquals(array[2], 2);
		assertEquals(array[3], 3);
		assertEquals(array[4], 5);
		assertEquals(array[5], 7);
		assertEquals(array[6], 9);
		assertEquals(array[7], 10);
		assertEquals(array[8], 20);
		assertEquals(array[9], 44);
		assertEquals(array[10], 99);
		assertEquals(array[11], 222);
	}

	@Test
	public void testEmptyArray() {

		int array[] = {};
		QuickSort.quickSort(array);

		assertEquals(array.length, 0);
	}
}

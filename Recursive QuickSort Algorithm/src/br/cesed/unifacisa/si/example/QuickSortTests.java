package br.cesed.unifacisa.si.example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 *         QuickSort recursive algorithm tests with JUnit 5.
 */
class QuickSortTests {

	@Test
	void testIsOrdered1() {

		int array[] = { 22, 34, 2, 1, 3, 44, 6, 8 };

		QuickSort.quickSort(array);
		assertEquals(array[0], 1);
		assertEquals(array[1], 2);
		assertEquals(array[2], 3);
		assertEquals(array[3], 6);
		assertEquals(array[4], 8);
		assertEquals(array[5], 22);
		assertEquals(array[6], 34);
		assertEquals(array[7], 44);

	}

	@Test
	void testIsOrdered2() {

		int array[] = { 3, 222, 5, 76, 94, 6, 7, 9, 32, 66, 8, 0, -1 };

		QuickSort.quickSort(array);
		assertEquals(array[0], -1);
		assertEquals(array[1], 0);
		assertEquals(array[2], 3);
		assertEquals(array[3], 5);
		assertEquals(array[4], 6);
		assertEquals(array[5], 7);
		assertEquals(array[6], 8);
		assertEquals(array[7], 9);
		assertEquals(array[8], 32);
		assertEquals(array[9], 66);
		assertEquals(array[10], 76);
		assertEquals(array[11], 94);
		assertEquals(array[12], 222);

	}

	@Test
	void testEmptyArray() {

		int array[] = {};
		QuickSort.quickSort(array);

		assertEquals(array.length, 0);
	}

}

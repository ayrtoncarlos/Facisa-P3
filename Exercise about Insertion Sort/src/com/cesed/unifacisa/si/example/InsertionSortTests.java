package com.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Insertion Sort sorting algorithm tests with JUnit 4.
 */
public class InsertionSortTests {

	@Test
	public void testIsOrdered1() {

		int[] array = { 22, 14, 1, -6, 3, 10 };

		InsertionSort.insertionSort(array);

		assertEquals(array[0], -6);
		assertEquals(array[1], 1);
		assertEquals(array[2], 3);
		assertEquals(array[3], 10);
		assertEquals(array[4], 14);
		assertEquals(array[5], 22);
	}

	@Test
	public void testIsOrdered2() {

		int[] array = { 55, 4, 3, -1 };

		InsertionSort.insertionSort(array);

		assertEquals(array[0], -1);
		assertEquals(array[1], 3);
		assertEquals(array[2], 4);
		assertEquals(array[3], 55);
	}

	@Test
	public void testEmptyArray() {

		int[] array = {};

		InsertionSort.insertionSort(array);

		assertEquals(array.length, 0);
	}

}

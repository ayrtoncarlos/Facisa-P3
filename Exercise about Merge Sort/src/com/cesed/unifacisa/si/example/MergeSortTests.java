package com.cesed.unifacisa.si.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Merge Sort sorting algorithm tests with JUnit 4.
 */
public class MergeSortTests {

	@Test
	public void testIsOrdered1() {

		int[] array = { 100, 20, -3, 0, 1, 1001 };

		MergeSort.mergeSort(array);

		assertEquals(array[0], -3);
		assertEquals(array[1], 0);
		assertEquals(array[2], 1);
		assertEquals(array[3], 20);
		assertEquals(array[4], 100);
		assertEquals(array[5], 1001);
	}

	@Test
	public void testIsOrdered2() {

		int[] array = { 1001, 20, -3, 0, 1, -45, 55, 2 };

		MergeSort.mergeSort(array);

		assertEquals(array[0], -45);
		assertEquals(array[1], -3);
		assertEquals(array[2], 0);
		assertEquals(array[3], 1);
		assertEquals(array[4], 2);
		assertEquals(array[5], 20);
		assertEquals(array[6], 55);
		assertEquals(array[7], 1001);
	}

	@Test
	public void testEmptyArray() {

		int[] array = {};

		MergeSort.mergeSort(array);

		assertEquals(array.length, 0);
	}

}

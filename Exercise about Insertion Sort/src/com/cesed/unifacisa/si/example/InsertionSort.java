package com.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Simple implementation of the Insertion Sort sorting algorithm.
 */
public class InsertionSort {

	/**
	 * Method that receives an array for sorting.
	 * 
	 * @param array
	 */
	public static void insertionSort(int[] array) {

		int size = array.length;

		for (int i = 1; i < size; ++i) {

			int pivot = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > pivot) {

				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = pivot;
		}
	}
}

package com.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Simple implementation of the Merge Sort sorting algorithm.
 */
public class MergeSort {

	/**
	 * Method that receives an array for sorting.
	 * 
	 * @param array
	 */
	public static void mergeSort(int[] array) {

		if (array.length != 0) {

			sort(array, 0, array.length - 1);
		}
	}

	/**
	 * Main function that sorts arr[l..r] using merge().
	 * 
	 * @param array
	 * @param left
	 * @param right
	 */
	private static void sort(int[] array, int left, int right) {

		if (left < right) {

			int middle = (left + right) / 2;

			sort(array, left, middle);
			sort(array, middle + 1, right);

			merge(array, left, middle, right);
		}
	}

	/**
	 * Logic of the MergeSort algorithm.
	 * 
	 * @param array
	 * @param left
	 * @param middle
	 * @param right
	 */
	private static void merge(int[] array, int left, int middle, int right) {

		int size1 = middle - left + 1;
		int size2 = right - middle;

		int[] arrayLeft = new int[size1];
		int[] arrayRight = new int[size2];

		for (int i = 0; i < size1; ++i) {

			arrayLeft[i] = array[left + i];
		}

		for (int j = 0; j < size2; ++j) {

			arrayRight[j] = array[middle + 1 + j];
		}

		int i = 0, j = 0, k = left;

		while (i < size1 && j < size2) {

			if (arrayLeft[i] <= arrayRight[j]) {

				array[k] = arrayLeft[i];
				i++;
			} else {

				array[k] = arrayRight[j];
				j++;
			}
			k++;
		}

		while (i < size1) {

			array[k] = arrayLeft[i];
			i++;
			k++;
		}

		while (j < size2) {

			array[k] = arrayRight[j];
			j++;
			k++;
		}
	}
}

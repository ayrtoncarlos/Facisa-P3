package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Simple implementation of the QuickSort sorting algorithm.
 */
public class QuickSort {

	/**
	 * Method that receives an array for sorting.
	 * 
	 * @param array
	 */
	public static void quickSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int minimum = i;

			for (int j = i; j < array.length; j++) {

				if (array[j] < array[minimum]) {

					minimum = j;
				}
			}

			if (i != minimum) {

				int temporary = array[i];
				array[i] = array[minimum];
				array[minimum] = temporary;
			}
		}
	}
}

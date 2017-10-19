package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         Implementation of the Quicksort recursive algorithm.
 */
public class QuickSort {

	/**
	 * Method that receives an array for sorting.
	 * 
	 * @param array
	 */
	public static void quickSort(int[] array) {

		if (array.length != 0) {

			recursiveQuickSort(array, 0, array.length - 1);
		}

	}

	/**
	 * Recursive quicksort logic.
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 */
	private static void recursiveQuickSort(int[] array, int startIndex, int endIndex) {

		int index = partition(array, startIndex, endIndex);

		if (startIndex < index - 1) {

			recursiveQuickSort(array, startIndex, index - 1);
		}

		if (endIndex > index) {

			recursiveQuickSort(array, index, endIndex);
		}
	}

	/**
	 * Divides array from pivot, left side contains elements less than Pivot while
	 * right side contains elements greater than pivot.
	 * 
	 * @param array
	 * @param left
	 * @param right
	 * @return
	 */
	private static int partition(int[] array, int left, int right) {

		int pivot = array[left];

		while (left <= right) {

			while (array[left] < pivot) {

				left++;
			}

			while (array[right] > pivot) {

				right--;
			}

			if (left <= right) {

				int temporary = array[left];
				array[left] = array[right];
				array[right] = temporary;

				left++;
				right--;
			}
		}

		return left;
	}

}

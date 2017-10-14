package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         A simple implementation of the ordering algorithm Bubble Sort.
 */
public class BubbleSort {

	/**
	 * Array sorting method.
	 * 
	 * @param array
	 */
	public static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			boolean isOrdered = true;

			for (int j = 1; j < array.length - i; j++) {

				if (array[j] < array[j - 1]) {

					int temporary = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temporary;

					isOrdered = false;
				}

			}
			if (isOrdered) {

				break;
			}

		}
	}
}

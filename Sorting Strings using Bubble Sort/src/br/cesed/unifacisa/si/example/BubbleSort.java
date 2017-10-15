package br.cesed.unifacisa.si.example;

/**
 * 
 * @author Ayrton Carlos
 *
 *         A simple implementation of the Bubble Sort ordering algorithm for
 *         Strings.
 */
public class BubbleSort {

	/**
	 * Array sorting method.
	 * 
	 * @param array
	 */
	public static void sortStrings(String[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			boolean isOrdered = true;

			for (int j = 1; j < array.length - i; j++) {

				if (array[j - 1].compareTo(array[j]) > 0) {

					String temporary = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temporary;
					isOrdered = false;
				}

			}

			if (isOrdered) {

				break;
			}
		}
	}

}

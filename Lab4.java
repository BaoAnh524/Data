package Lab4;

import java.util.Arrays;

public class Lab4 {
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int[] selectionSort_Min(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] < array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
		return array;
	}

	public static int[] insertionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int cur = array[i];
			int j = i;
			while (j > 0 && array[j - 1] > cur) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = cur;
		}
		return array;
	}

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		 System.out.println(Arrays.toString(selectionSort_Min(arr)));
		 System.out.println(Arrays.toString(bubbleSort(arr)));
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
}

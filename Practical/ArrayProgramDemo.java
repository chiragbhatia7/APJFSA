//WAP to
//- print duplicate elements from an array
//- print elements of an present at even/odd position
//- print largest, smallest element present in array
//- print array in sorted form(asc/desc)
//- add & multiply two matrices

package Arrays;

import java.util.Arrays;

public class ArrayProgramDemo {

	public static void printDuplicates(int[] arr) {
		System.out.print("Duplicate elements in the given array: ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
		System.out.println();
	}

	public static void printOnEvenPositions(int arr[]) {
		System.out.print("The elements present in even positions in the provided array are: ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	public static void printOnOddPositions(int arr[]) {
		System.out.print("The elements present in odd positions in the provided array are: ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	public static void printLargestElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("The largest element is: " + largest);
	}

	public static void printSmallestElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("The smallest element is: " + smallest);
	}

	public static void sortArrayAscending(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("The sorted array in ascending order is: " + Arrays.toString(arr));
	}

	public static void sortArrayDescending(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("The sorted array in descending order is: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 3 };
		printDuplicates(arr);
		printOnEvenPositions(arr);
		printOnOddPositions(arr);
		printLargestElement(arr);
		printSmallestElement(arr);
		sortArrayAscending(arr);
		sortArrayDescending(arr);
	}
}

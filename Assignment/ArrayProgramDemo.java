//WAP to
//- print duplicate elements from an array
//- remove duplicate elements from an array
//- print elements of an present at even/odd position
//- print largest, smallest element present in array
//- print array in sorted form(asc / desc)
//- add & multiply two matrices

package Arrays;

import java.util.Arrays;

public class ArrayProgramDemo {

	public static void printDuplicates(int[] arr) {
		// Print a message to indicate that we're printing the duplicates
		System.out.print("Duplicate elements in the given array: ");

		// Loop over the array to check for duplicates
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// If we find a duplicate, print it to the console and break out of the inner
				// loop
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}

		// Print a newline character to separate the output from any other text
		System.out.println();
	}

	public static void removeDuplicates(int[] arr) {
		// Get the length of the input array
		int n = arr.length;

		// Initialize variables for the new array and the index of the last unique
		// element
		int k = 0;
		int[] uniqueArr = new int[n];

		// Loop over the input array, checking each element for duplicates
		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			// Loop over the new array to check if the current element is a duplicate
			for (int j = 0; j < k; j++) {
				if (arr[i] == uniqueArr[j]) {
					isDuplicate = true;
					break;
				}
			}

			// If the current element is not a duplicate, add it to the new array
			if (!isDuplicate) {
				uniqueArr[k++] = arr[i];
			}
		}

		// Create a new array of the correct length to store the unique elements
		int[] finalArr = new int[k];

		// Copy the unique elements from the temporary array to the new array
		System.arraycopy(uniqueArr, 0, finalArr, 0, k);

		// Print the new array to the console
		System.out.println("New array after removing duplicates is: " + Arrays.toString(finalArr));
	}

	public static void printOnEvenPositions(int arr[]) {
		// Prints the elements present in even positions in the provided array
		System.out.print("The elements present in even positions in the provided array are: ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	public static void printOnOddPositions(int arr[]) {
		// Prints the elements present in odd positions in the provided array
		System.out.print("The elements present in odd positions in the provided array are: ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	public static void printLargestElement(int[] arr) {
		// Check if the array is empty or null
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		// Initialize the largest element as the first element in the array
		int largest = arr[0];
		// Traverse the array and compare each element with the current largest element
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				// If the current element is larger than the current largest element, update the
				// largest element
				largest = arr[i];
			}
		}
		// Print the largest element
		System.out.println("The largest element is: " + largest);
	}

	public static void printSmallestElement(int[] arr) {
		// Check if the array is empty or null
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		// Initialize the smallest element as the first element in the array
		int smallest = arr[0];
		// Traverse the array and compare each element with the current smallest element
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				// If the current element is smaller than the current smallest element, update
				// the smallest element
				smallest = arr[i];
			}
		}
		// Print the smallest element
		System.out.println("The smallest element is: " + smallest);
	}

	public static void sortArrayAscending(int[] arr) {
		// Check if the array is empty or null
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		// Get the length of the array
		int n = arr.length;
		// Loop through the array
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Swap the elements if they are not in the correct order
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// Print the sorted array in ascending order
		System.out.println("The sorted array in ascending order is: " + Arrays.toString(arr));
	}

	public static void sortArrayDescending(int[] arr) {
		// Check if the array is empty or null
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		// Get the length of the array
		int n = arr.length;
		// Loop through the array
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Swap the elements if they are not in the correct order
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// Print the sorted array in descending order
		System.out.println("The sorted array in descending order is: " + Arrays.toString(arr));
	}

	public static void addMatrices(int[][] matrix1, int[][] matrix2) {
		// Check that the two matrices have the same dimensions
		if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			System.out.println("Error: Matrices must have the same dimensions.");
			return;
		}

		int rows = matrix1.length;
		int columns = matrix1[0].length;

		// Create a new matrix to hold the result
		int[][] result = new int[rows][columns];

		// Iterate through the matrices and add their corresponding elements
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Print the resulting matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 3 };
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		// printDuplicates(arr);
		// removeDuplicates(arr);
		// printOnEvenPositions(arr);
		// printOnOddPositions(arr);
		// printLargestElement(arr);
		// printSmallestElement(arr);
		// sortArrayAscending(arr);
		// sortArrayDescending(arr);
		addMatrices(a, b);
	}
}

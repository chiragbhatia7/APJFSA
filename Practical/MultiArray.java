package Arrays;

public class MultiArray {
	public static void main(String[] args) {
		int arr1[][] = { { 9, 8, 7 }, { 1, 2, 3 }, { 5, 4, 3 } }; // declaration, instantiation and initialization of a
																	// 2D array
		// print
		for (int i = 0; i < 3; i++) { // for each row
			for (int j = 0; j < 3; j++) { // iterating the row
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}

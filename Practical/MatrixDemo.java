package Arrays;

public class MatrixDemo {
	public static void main(String[] args) {
		// Two Matrices
		int num1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int num2[][] = { { 4, 3, 2 }, { 6, 5, 4 }, { 8, 7, 6 } };

		// Result matrix to store sum
		int res[][] = new int[3][3];

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				res[i][j] = num1[i][j] + num2[i][j];
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------");

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				res[i][j] = num1[i][j] - num2[i][j];
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------");

		// Creating two matrices
		int a1[][] = { { 1, 2 }, { 3, 4 } };
		int a2[][] = { { 4, 5 }, { 9, 8 } };

		// Creating a resultant matrix to store the result
		int result[][] = new int[2][2];

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				result[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					result[i][j] += a1[i][k] * a2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}

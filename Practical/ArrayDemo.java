// Understanding arrays

package Arrays;

import java.util.Iterator;

public class ArrayDemo {
	public static void main(String[] args) {
		int myarray[] = new int[4]; // declaration and instantiation
		myarray[0] = 23; // initialization
		myarray[1] = 34;
		myarray[2] = 76;
		myarray[3] = 89;

		System.out.println(myarray[2]); // value at index 2

		// traversing the array
		for (int i = 0; i < myarray.length; i++) { // loop will run till the length of the array
			System.out.println(myarray[i]);
		}

		double nums[] = { 2.5, 5.5, 5.7, 2.3 }; // declaration, instantiation and initialization

		// print nums array
		System.out.println("Array elements: ");
//		for (int j = 0; j < nums.length; j++) {
//			System.out.print(nums[j] + " , ");
//		}

		// alternate for loop for arrays - for each loop holds an element in a variable, then executes body of the loop
		for (double j : nums) {
			System.out.print(j + " , ");
		}
	}
}

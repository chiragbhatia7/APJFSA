package Practice;

import java.util.Scanner;

public class RestaurantOrderingDemo {

	public static void main(String[] args) {
		String[][][] menu = {
				{ { "Starters" }, { "Spring rolls", "75" }, { "Steam Momos", "100" }, { "Garlic Bread", "50" } },
				{ { "Main Course" }, { "Butter Chicken", "200" }, { "Veg Biryani", "150" },
						{ "Fish and Chips", "250" } },
				{ { "Desserts" }, { "Chocolate Cake", "100" }, { "Fruit Salad", "80" }, { "Ice Cream", "60" } } };

		// Display the menu category-wise
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i][0][0] + ":"); // Print the category name
			for (int j = 1; j < menu[i].length; j++) {
				System.out.println(menu[i][j][0] + " - Rs. " + menu[i][j][1]); // Print the item name and price
			}
			System.out.println(); // Print a blank line after each category
		}
		// Take input from the user about what they want to order
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many items do you want to order?");
		int numberOfItems = scanner.nextInt();
		scanner.nextLine();
		double billTotal = 0;
		for (int i = 0; i < numberOfItems; i++) {
			System.out.print("Enter the name of the item you want to order: ");
			String itemName = scanner.nextLine();

			// Find the item in the menu and print its price
			boolean itemFound = false;
			for (int j = 0; j < menu.length; j++) {
				for (int k = 1; k < menu[j].length; k++) {
					if (itemName.equalsIgnoreCase(menu[j][k][0])) {
						System.out.println("Item added to bill");
						billTotal += Double.parseDouble(menu[j][k][1]);
						itemFound = true;
						break;
					}
				}
				if (itemFound) {
					break;
				}
			}
			if (!itemFound) {
				System.out.println("Sorry, the item you entered is not available in our menu.");
			}
			System.out.println("Total amount: Rs." + billTotal);
		}
		scanner.close();
	}
}

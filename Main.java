import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList mockList = new LinkedList();
		LinkedList userList = new LinkedList();
		int x = 0;
		for (x = 0; x <= 9;) {
			mockList.add(x);
			x++;
		}
		System.out.println("Hello!");
		System.out.print("An example list is: ");
		mockList.showList();
		mockList.deleteList();
		System.out.println();
		System.out.println("How many nodes would you like in your list?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for (x = 0; x < n;) {
			userList.add(x);
			x++;
		}
		System.out.println("Your list has been created!");
		System.out.print("Your list: ");
		userList.showList();
		System.out.println();
		System.out.println();
		System.out.println(
				"If you would like to edit your list, type 'edit', then press enter. Otherwise, enjoy your list!");
		String input = scanner.nextLine();
		if (input.contains("edit")) {
			System.out.println("Would you like to add or delete a node?");
			String input2 = scanner.nextLine();
			if (input2.contains("add")) {
				System.out.println("Would you like to add a node at the front of the list (type front),"
						+ " the back of the list (type back), or between two nodes (type between)");
				String input3 = scanner.nextLine();
				if (input3.contains("front")) {
					System.out.println("Type the number you would like to add: ");
					int addtofront = scanner.nextInt();
					scanner.nextLine();
					userList.newFront(addtofront);
				} else if (input3.contains("back")) {
					System.out.println("Type the number you would like to add: ");
					int addtoback = scanner.nextInt();
					scanner.nextLine();
					userList.add(addtoback);
				} else if (input3.contains("between")) {
					System.out.println("Type the number you would like to add: ");
					int addbetween = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Type the number you would like to add it after: ");
					int addbetween1 = scanner.nextInt();
					scanner.nextLine();
					userList.addBetween(addbetween, addbetween1);
				}
				System.out.println("Here's your edited list.");
				userList.showList();
			} else if (input2.contains("delete")) {
				System.out.println("Which node would you like to delete?");
				int deleter = scanner.nextInt();
				scanner.nextLine();
				userList.deleteNode(deleter);
				System.out.println("Here's your edited list.");
				userList.showList();
			}
		} else {
			System.out.print("You may have entered something incorrectly.");
		}
		scanner.close();
	}
}

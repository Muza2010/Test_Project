import java.util.ArrayList;
import java.util.Scanner;

public class DynamicGuestList {
	public static void main (String [] args) {
		ArrayList <String> guestList = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		String input = " ";
		System.out.println("Dynamic Guest List Manager"); 
		while (!input.equalsIgnoreCase("exit")) {
			System.out.println("\nChoose an operation:");
			System.out.println("1: Add Guest");
			System.out.println("2: Remove Guest");
			System.out.println("3: Display Guest List");
			System.out.println("Type 'exit' to quit");
			
			input = scanner.nextLine();
			
			switch (input) {
				case "1":
					System.out.println("Enter guest's name to add:");
					String nameToAdd = scanner.nextLine();
					guestList.add(nameToAdd);
					System.out.println(nameToAdd + " has been added to the guest list.");
					break;
				case "2":
					System.out.println("Enter guest's name to remove");
					String nameToRemove = scanner.nextLine();
					if (guestList.remove(nameToRemove)){
						System.out.println( nameToRemove+ " has been removed from the guest list.");
					} else {
						System.out.println(nameToRemove+ " was not found in the guest list.");
					}
					break;
				case "3":
					System.out.println("Current Guest List");
					for (String guest : guestList){
						System.out.print(guest);
					}
					break;
				default :
					if (!input.equalsIgnoreCase("Exit")){
						System.out.println("Invalid input. Please try again.");
					}
					break;
			}
		}
		System.out.println("Goodbye!");
	}
}

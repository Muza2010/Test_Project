import java.util.LinkedList;
import java.util.Scanner;

public class ToDoListManager {

	public static void main (String[] args) {
		LinkedList<String> toDoList = new LinkedList<>();
		Scanner scanner = new Scanner (System. in) ;
		String input = " ";	
		System. out .println ("To-Do List Manager") ;
	
		while (!input.equalsIgnoreCase("exit")) {
			System. out.println(" \nChoose an operation:");
			System.out.println("1: Add Task");
			System.out.println( "2:Remove Task");
			System.out.println("3: Display To-Do List");
			System.out.println ("Type 'exit' to quit");
		
			input = scanner.nextLine();

			switch (input) {

				case "1":
					System.out.println ("Enter task to add:");
					String taskToAdd = scanner.nextLine();
					toDoList.add(taskToAdd);
					System.out .println(" " + taskToAdd + " has been added to your to-do list.");
					break; 
				case "2":

					System.out.println ("Enter task index to remove (starting from 0):");
					int indexToRemove;
					try{

						indexToRemove = Integer.parseInt (scanner.nextLine());

						if (indexToRemove >= 0 && indexToRemove< toDoList.size()) {

							String removedTask = toDoList.remove(indexToRemove);
							System.out.println("'"+removedTask+"' has been removed from your to-do list.");
						} else {
							System.out.println("Invalid index. Please try again.");
						} 
					} catch (NumberFormatException e) {
							System.out.println( "Please enter a valid number");
						}
						break;
					case "3":
						System.out.println("Current To-Do List");
						for (int i = 0; i < toDoList.size() ; i++){
							System.out.println( i + ": " +  toDoList.get(i));
						}
						break;
					default:
						if (!input.equalsIgnoreCase("exit")) {
							System.out.println("Invalid input. Please try again.");
						}
						break;
			}
		}
		System.out.println("Goodbye!");
	}
}

import java.util.Scanner;
public class ProjectThanksgiving{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		int n=5;
		String menu =
		"Here is the menu for Thanksgiving\nEntrees:\nTurkey\nSides:\nCorn Bread\nDesserts:\nApple Pie\nPumpkin Pie\n ";
		System.out.println("Happy Thanksgiving! What would you like to order?");
		for (int i=0; i < n; i++){
			System.out.println("1. Order something from the menu");
			System.out.println("2.View menu");
			System.out.println("3.Exit");
			System.out.println("Choose an option:");

			int input = scanner.nextInt();
			scanner.nextLine();
			if ( input == 3){
				break;
			}else if ( input == 2){
				System.out.println(menu);

			}else {
				System.out.println("Please state what you want to order");
				String food = scanner.nextLine();

				if ( food.equals("Apple Pie") || food.equals("Pumpkin Pie")){
					System.out.println("Great Choice! Your order will be ready in 10 minutes.");
					break;
				} else if ( food.equals("Turkey")){
					System.out.println("Great Choice! Your order will be ready in 30 minutes.");
					break;
				} else if ( food.equals("Corn Bread")) {
					System.out.println("Really? Are you sure you don't want to add anything else?");
					break;
				}else {
                System.out.println("Invalid option. Try again.");
				}
			}

		}
 System.out.println("Happy Thanksgiving and Goodbye!");
    }
}

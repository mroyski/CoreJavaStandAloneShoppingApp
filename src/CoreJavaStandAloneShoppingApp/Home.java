package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home {
	public static void Display(User user)
			throws IOException
	{
		if (user.getEmail() == null)
		{
			Register.Display();
		}
		
		else {
			printOptions(user);
			printUserItems(user);
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			String input = reader.readLine();
			
			switch(input) {
				case "1":
					Register.Display();
					break;
				case "2":
					Login.Display();
					break;
				case "3":
					Buy.Display(user);
					break;
				case "4":
					Replace.Display(user);
					break;
				case "5":
					System.out.println("Bye!!!");
					System.exit(0);
				default:
					System.out.println("Invalid Command");
					reader.readLine();
					break;
			}
		}
	}
	
	public static void printOptions(User user) {
		System.out.println("Standalone Ecommerce App\n");
		System.out.println("Logged in as: " + user.getEmail() + "\n");
		System.out.println("1.REGISTER");
		System.out.println("2.LOGIN");
		System.out.println("3.BUY AN ITEM");
		System.out.println("4.REPLACE AN ITEM");
		System.out.println("5.EXIT");
	}
	public static void printUserItems(User user) {
		System.out.println("\nItem List:");
		for (int i = 0; i < user.items.size(); i++) {
			System.out.println(i + ". " + user.items.get(i).Name + " $" + user.items.get(i).Price);
		}
		
		int total = 0;
		for (int i = 0; i < user.items.size(); i++) {
			total += user.items.get(i).Price;
		}
		System.out.println("Total: $" + total);
	}
}

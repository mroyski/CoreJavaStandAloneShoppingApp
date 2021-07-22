package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home {
	public static User Display(User user)
			throws IOException
	{
		System.out.println("Standalone Ecommerce App\n");
		System.out.println("Logged in as: " + user.getEmail() + "\n");
		System.out.println("1.REGISTER");
		System.out.println("2.LOGIN");
		System.out.println("3.BUY AN ITEM");
		System.out.println("4.REPLACE AN ITEM");
		System.out.println("5.EXIT");
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		String input = reader.readLine();
		
		if (user.getEmail() == null)
		{
			user = Register.Display();
		}
		
		else {
			switch(input) {
				case "1":
					user = Register.Display();
					break;
				case "2":
					user = Login.Display();
				case "5":
					System.out.println("Bye!!!");
					System.exit(0);
				default:
					System.out.println("ex");
			}
		}
		return user;
	}
}

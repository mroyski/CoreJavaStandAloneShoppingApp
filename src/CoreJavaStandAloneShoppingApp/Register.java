package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Register 
{
	public static void Display() 
			throws IOException
	{
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.println("REGISTER\n");
	
		System.out.println("Enter a valid email address:");
		String email = reader.readLine();
	
		System.out.println("Enter your password");
		String password = reader.readLine();
	
		User newUser = new User(email, password);
		Users.addUser(newUser);
		
		CurrentUser.user = newUser;
	}
}

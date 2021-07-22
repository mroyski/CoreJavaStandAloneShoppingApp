package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
	public static void Display() 
			throws IOException
	{
		System.out.println("LOGIN\n");
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Username:\n");
		String email = reader.readLine();
		
		System.out.println("Password:\n");
		String password = reader.readLine();
		
		User loginUser = Users.AllUsers.stream()
				.filter(u -> email.equals(u.getEmail()))
				.filter(u -> password.equals(u.getPassword()))
				.findFirst()
				.orElse(null);
				
		if (loginUser == null) {
			System.out.println("User does not exist!");
			reader.readLine();
		}
		else {
			CurrentUser.user = loginUser;
		}
	}
}

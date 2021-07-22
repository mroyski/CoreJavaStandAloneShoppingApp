package CoreJavaStandAloneShoppingApp;

import java.io.IOException;
import java.util.*;

public class CoreJavaStandAloneShoppingApp {

	public static void main(String[] args)
			throws IOException
{		
		boolean running = true;
		User user = new User();
		
		while(running) {

			if (user.getEmail() == null) {
				user = Register.Display();
			}
			else {
				user = Home.Display(user);
			}
		}

}
	
	public static class Users {
		public static ArrayList<User> AllUsers = new ArrayList<User>();
		
		public static void addUser(User user) {
			AllUsers.add(user);
		}
	}
	
}

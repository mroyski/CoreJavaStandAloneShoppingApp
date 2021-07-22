package CoreJavaStandAloneShoppingApp;

import java.util.ArrayList;

public class Users {
	public static ArrayList<User> AllUsers = new ArrayList<User>();
	
	public static void addUser(User user) {
		AllUsers.add(user);
	}
}

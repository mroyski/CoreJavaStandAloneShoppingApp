package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class CoreJavaStandAloneShoppingApp {

	public static void main(String[] args)
			throws IOException
{
		Home(new User());
		


	}
	
	public static void Register() 
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
		Users.AllUsers.add(newUser);
		
		Home(newUser);
	}
	
	public static void Home(User user)
			throws IOException
	{
		System.out.println("Standalone Ecommerce App\n");
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
			Register();
		}
		
		else {
			switch(input) {
				case "1":
					Register();
					break;
				default:
					System.out.println("");
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

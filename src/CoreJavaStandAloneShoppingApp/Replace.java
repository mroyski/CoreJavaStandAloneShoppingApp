package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace {
	public static void Display(User user)
			throws IOException
	{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("REPLACE\n");
			
		for (int i = 0; i < user.items.size(); i++) {
			System.out.println(i + ". " + user.items.get(i).Name + " $" + user.items.get(i).Price);
		}
		
		int input = Integer.parseInt(reader.readLine());
		user.items.remove(input);
	}
}

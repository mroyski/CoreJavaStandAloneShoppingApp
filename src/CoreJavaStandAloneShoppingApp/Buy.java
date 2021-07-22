package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Buy {
	public static ArrayList<Item> allItems;
	
	public Buy() {
		Buy.allItems = new ArrayList<Item>();
		allItems.add(new Item("Shirt", 15));
		allItems.add(new Item("Jeans", 45));
		allItems.add(new Item("Hat", 20));
		allItems.add(new Item("Shoes", 32));
		allItems.add(new Item("Candy", 2));
		allItems.add(new Item("Drink", 4));
	}
	
	public static void Display(User user)
		throws IOException
	{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("BUY\n");
			
		for (int i = 0; i < allItems.size(); i++) {
			System.out.println(i + ". " + allItems.get(i).Name + " " + allItems.get(i).Price);
		}
		
		System.out.println("Which will you buy?");
		int itemNum = Integer.parseInt(reader.readLine());
		
		user.items.add(allItems.get(itemNum));

	}
}

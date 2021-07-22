package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Buy {
	public static ArrayList<Item> items;
	
	public Buy() {
		Buy.items = new ArrayList<Item>();
		items.add(new Item("Shirt", 15));
		items.add(new Item("Jeans", 45));
		items.add(new Item("Hat", 20));
		items.add(new Item("Shoes", 32));
		items.add(new Item("Candy", 2));
		items.add(new Item("Drink", 4));
	}
	
	public static void Display()
		throws IOException
	{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("BUY\n");
			
		for (int i = 0; i < items.size(); i++) {
			System.out.println(i + ". " + items.get(i).Name + " " + items.get(i).Price);
		}
		
		System.out.println("Which will you buy?");
		String itemNum = reader.readLine();
		

	}
}

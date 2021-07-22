package CoreJavaStandAloneShoppingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoreJavaStandAloneShoppingApp {

	public static void main(String[] args)
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
		
		System.out.println(input);

	}
	
	public static void Register() {
		
	}

}

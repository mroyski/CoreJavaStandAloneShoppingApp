package CoreJavaStandAloneShoppingApp;

import java.io.IOException;

public class CoreJavaStandAloneShoppingApp {

	public static void main(String[] args)
			throws IOException
{		
		boolean running = true;
		
		while(running) {

			Home.Display(CurrentUser.user);
		}

	}
}

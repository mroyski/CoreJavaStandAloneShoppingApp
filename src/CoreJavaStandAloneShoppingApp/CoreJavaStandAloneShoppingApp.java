package CoreJavaStandAloneShoppingApp;

import java.io.IOException;

public class CoreJavaStandAloneShoppingApp {

	public static void main(String[] args)
			throws IOException
{		
		boolean running = true;
		
		while(running) {

			if (CurrentUser.user.getEmail() == null) {
				if (Users.AllUsers.size() > 0) Login.Display();
				else Register.Display();
			}
			else Home.Display(CurrentUser.user);
		}

	}
}

package CoreJavaStandAloneShoppingApp;

import java.io.IOException;

public class CoreJavaStandAloneShoppingApp {

	public static void main(String[] args)
			throws IOException
{		
		boolean running = true;
		User user = new User();
		
		while(running) {

			if (user.getEmail() == null) {
				if (Users.AllUsers.size() > 0) user = Login.Display();
				else user = Register.Display();
			}
			else {
				user = Home.Display(user);
			}
		}

	}
}

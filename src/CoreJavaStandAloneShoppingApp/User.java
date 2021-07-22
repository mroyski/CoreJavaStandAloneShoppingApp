package CoreJavaStandAloneShoppingApp;

import java.util.ArrayList;

public class User {
	private String email;
	private String password;
	public ArrayList<String> items;
	
	public User() {
	
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
		this.items = new ArrayList<String>();
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}

}

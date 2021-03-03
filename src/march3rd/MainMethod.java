package march3rd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainMethod {

	public static void main(String[] args) {
		try {
			
		// Regex for Email Validation	
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^"
					+ "-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
			 
		Pattern pattern = Pattern.compile(regex);
		
		//Create an Anonymous Object of Functional Interface using Lambda.
		EmailValidator emailvalidator = (email)-> {
			Matcher matcher = pattern.matcher(email);
		    System.out.println((matcher.matches())?email +" : "+ "Is Valid": 
		    	email +" : "+ "Is Not Valid");
		};
		
		//List of emails to be validated
		List<String> emails = new ArrayList<String>();
 
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("username@yahoo.c");
		emails.add("username@yahoo.corporate");
		emails.add("user.name@domain.com");
		emails.add("user_name@domain.com");
		emails.add(".username@yahoo.com");
		emails.add("username@yahoo.com.");
		emails.add("username@yahoo..com");
		emails.add("username@yahoo.corporate.in");
		
		emails.forEach((String email) -> emailvalidator.validateEmail(email));
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

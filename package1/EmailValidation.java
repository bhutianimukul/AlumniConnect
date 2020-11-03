package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;


public class EmailValidation {
public static boolean isvalid(String email1) {
	String email=email1.toLowerCase();
	String regex="^[A-Za-z0-9_.]+@[A-Za-z0-9.-]+$";
	Pattern p= Pattern.compile(regex);
	if(email==null) {
		return false;
	}
	return p.matcher(email).matches();
}
public static boolean phoneisvalid(String phone) {
	String email=phone;
	String regex="(0/91)?[7-9][0-9]{9}";
	Pattern p= Pattern.compile(regex);
	if(email==null) {
		return false;
	}
	return p.matcher(email).matches();
}
public static boolean name_isvalid(String name) {

	String email=name;
	String regex="^[A-Z][a-z]{1,8}";
	Pattern p= Pattern.compile(regex);
	if(email==null) {
		return false;
	}
	return p.matcher(email).matches();

}
public static boolean passisvalid(String password) {
	String regex = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$"; 

// Compile the ReGex 
Pattern p = Pattern.compile(regex); 

// If the password is empty 
// return false 
if (password == null) { 
 return false; 
} 

// Pattern class contains matcher() method 
// to find matching between given password 
// and regular expression. 
return p.matcher(password).matches(); 

// Return if the password 
// matched the ReGex 

}
	public static void main(String[] args) {
		String s=new String();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(passisvalid(s));

	}

}

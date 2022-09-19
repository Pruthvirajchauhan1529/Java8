package functional_inter_predicate;

import java.util.Scanner;
import java.util.function.*;

class User{

	String username;
	String password;
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
}

public class UserPredicate{
	public static void main(String[] args) {
		
		Predicate<User> p = u -> u.username.equals("Pruthviraj") && u.password.equals("Java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName: ");
		String username = sc.next();
		System.out.println("Enter Password: ");
		String password = sc.next();
		User user =new User(username,password);

		if(p.test(user)){
			System.out.println("Valid user and you can access all service");
		}else{
			System.out.println("UserName and Password invalide");
		}
	}
}
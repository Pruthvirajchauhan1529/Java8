package functional_inter_function;

import java.util.function.Function;
import java.util.Scanner;

public class UserAutheFunction{
	public static void main(String[] args) {
		
		Function<String,String> f1 = s -> s.toLowerCase();
		Function<String,String> f2 = s -> s.substring(0,5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName: ");
		String username = sc.next();
		System.out.println("Enter Password: ");
		String password = sc.next();
		if(f1.andThen(f2).apply(username).equals("pruth") && password.equals("java"))
		{
			System.out.println("Valid User");
		}
		else{
			System.out.println("Invalid User");	
		}
	}
}
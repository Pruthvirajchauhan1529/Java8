package date_and_time_api;

import java.util.Scanner;
import java.time.*;

public class LeapYearDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Year: ");
		int n = sc.nextInt();
		Year y = Year.of(n);

		if(y.isLeap()){
			System.out.printf("%d is Leap Year",n);
		}else{
			System.out.printf("%d is not Leap Year",n);
		}
	}
}
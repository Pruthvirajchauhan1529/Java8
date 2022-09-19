package date_and_time_api;

import java.time.*;

public class LocalDateTimeDemo{
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: "+date);
		LocalTime time = LocalTime.now();
		System.out.println("Current Time: "+time);		
	}
}
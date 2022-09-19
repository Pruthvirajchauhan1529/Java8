package date_and_time_api;

import java.time.*;

public class LocalDateTimeDemo2{
	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		System.out.printf("Date: %d-%d-%d",dd,mm,yyyy);
		
		int hour = dt.getHour();
		int min = dt.getMinute();
		int sec = dt.getSecond();
		int non = dt.getNano();

		System.out.printf("\nTime: %d:%d:%d:%d",hour,min,sec,non);
		System.out.println("\n");
		System.out.printf("Date: %d-%d-%d",yyyy,mm,dd);
		System.out.printf("\nTime: %d,%d",hour,min);
	} 
}
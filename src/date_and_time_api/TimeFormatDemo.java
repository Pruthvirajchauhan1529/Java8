package date_and_time_api;

import java.time.*;

public class TimeFormatDemo{
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();	
		System.out.println(time);

		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int n = time.getNano();

		System.out.println(hour+"-"+min+"-"+sec+"."+n);
		System.out.printf("%d:%d:%d:%d",hour,min,sec,n);
	}
}
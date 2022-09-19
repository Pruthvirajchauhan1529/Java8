package date_and_time_api;

import java.time.*;

public class LocalDateTimeDemo3{
	public static void main(String[] args) {
		//LocalDateTime dt2 = LocalDateTime.of(yyyy,mm,dd,hour,min);
		LocalDateTime dt2 = LocalDateTime.of(1995,8,29, 01,45);
		System.out.println("Manualy add Date and Time: "+dt2); 

		System.out.println("After Six Months: "+dt2.plusMonths(6));
		System.out.println();
		System.out.println("Before Six Months: "+dt2.minusMonths(6));
	}
}
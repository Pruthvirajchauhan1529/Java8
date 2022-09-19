package date_and_time_api;

import java.time.*;

public class PeriodYearDemo{
	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1995,8,29);
		LocalDate today = LocalDate.now();

		Period p = Period.between(birthday,today);
		System.out.printf("Your age is %d Years %d Months and %d Days "
			,p.getYears(),p.getMonths(),p.getDays());

		LocalDate deathday = LocalDate.of(1995+60,8,29);
		Period p2 = Period.between(today,deathday);
		int d = p2.getYears()*365 + p2.getMonths()*30 + p2.getDays();
		System.out.printf("\nYou will be on earth only %d days, Hurry Up to do important things",d);

	}
}

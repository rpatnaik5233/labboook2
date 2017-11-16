package question3;

import java.time.LocalDate;
import java.time.Month;


public class ProductDate {

	public static void main(String[] args) {
	
		LocalDate pdate=LocalDate.of(2016, Month.APRIL, 10);
		LocalDate futureDate = pdate.plusYears(1);
		futureDate=futureDate.plusMonths(6);
		System.out.println(futureDate);
	
	}

}

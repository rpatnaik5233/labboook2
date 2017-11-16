package question3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate start=LocalDate.of(1996,Month.FEBRUARY, 10);
LocalDate end=LocalDate.of(2017,Month.FEBRUARY, 10);
Period period=start.until(end);
System.out.println("Days:"+ period.getDays());
System.out.println("Months:"+period.getMonths());
System.out.println("Years:"+ period.getYears());
	}

}

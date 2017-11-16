package question3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Date1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate start = LocalDate.of(2015,Month.DECEMBER,15);
Period period = start.until(today);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());
}
}
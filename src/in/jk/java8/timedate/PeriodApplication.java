package in.jk.java8.timedate;

import java.time.LocalDate;
import java.time.Period;

public class PeriodApplication {

	public static void main(String[] args) {
		
        LocalDate  localDate =  LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2021, 05, 28);
		Period period = Period.between(localDate, localDate2);
		System.out.println("Year  "+period.getYears());
		System.out.println("Month "+period.getMonths());
		System.out.println("Day   "+period.getDays());
		
	}

}

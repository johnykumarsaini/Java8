package in.jk.java8.timedate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateApplication {
	
	public static void main(String[] args) {
		
		
		LocalDate  localDate =  LocalDate.now();
		
		LocalDate localDate2 = LocalDate.of(2020, 03, 28);//
		LocalDate  localDate3 =  LocalDate.parse("2020-03-28");
		LocalDate localDate4 = LocalDate.of(2020, 03, 28);//
		System.out.println(localDate2);
		System.out.println(localDate3);
		System.out.println(localDate4);
		System.out.println();
		System.out.println("Day of month "+localDate.getDayOfMonth());
		System.out.println("Day of year "+localDate.getYear());
        System.out.println(" No of Days of Year "+localDate.getDayOfYear());
		System.out.println("Month Value "+localDate.getMonthValue());
		System.out.println("Day Of fWeek "+localDate.getDayOfWeek());
		System.out.println("Day of Era "+localDate.getEra());
		System.out.println("Day of Month "+localDate.getMonth());
		System.out.println("get Chronology "+localDate.getChronology());
		System.out.println("get lengthOfMonth "+localDate.lengthOfMonth());
        System.out.println("get DAY_OF_WEEK "+localDate.get(ChronoField.DAY_OF_WEEK));
		System.out.println("get ERA "+localDate.get(ChronoField.ERA));



		
		System.out.println();

		
		
	}

}

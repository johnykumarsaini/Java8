package in.jk.java8.timedate;

import java.time.Duration;
import java.time.LocalTime;

public class DurationApplication {
	
	public static void main(String[] args) {
		
		LocalTime localDate1 =LocalTime.now();
		LocalTime localDate2 =LocalTime.of(1,20,20);
		Duration duration0 =Duration.between(localDate1,localDate2);
		System.out.println(duration0);
		Duration duration =Duration.ofDays(1);
		System.out.println(duration);
		
	}

}

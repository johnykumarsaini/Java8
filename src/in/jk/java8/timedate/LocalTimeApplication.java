package in.jk.java8.timedate;

import java.time.LocalTime;

public class LocalTimeApplication {

	public static void main(String[] args) {
		
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Current Time :: "+localTime);
		System.out.println("Current Time MAX:: "+localTime.MAX);
		System.out.println("Current Time Min:: "+localTime.MIN);
		System.out.println("Current Time toSecondOfDay:: "+localTime.toSecondOfDay());


		
		
		
		
		
		LocalTime localTime2 = LocalTime.of(01,20,23);
		System.out.println(localTime);
		
	}
}

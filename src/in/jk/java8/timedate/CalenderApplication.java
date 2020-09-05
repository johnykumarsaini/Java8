package in.jk.java8.timedate;

import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;

public class CalenderApplication {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Local Date  :: "+localDate);
	    ThaiBuddhistDate buddhistDate = ThaiBuddhistDate.from(localDate);
	    System.out.println("Buddhist Date :: "+buddhistDate);
	    System.out.println("Buddhist lengthOfYear :: "+buddhistDate.lengthOfYear());
	    
	    MinguoDate minguoDate = MinguoDate.from(localDate);
	    System.out.println("Minguo Date :: "+minguoDate);
	   
	    JapaneseDate japaneseDate = JapaneseDate.from(localDate);
	    System.out.println("Japanese Date :: "+japaneseDate);
	    
	    HijrahDate hijrahDate = HijrahDate.from(localDate);
	    System.out.println("HijrahDate Date :: "+hijrahDate);
	    
	    
		
	}

}

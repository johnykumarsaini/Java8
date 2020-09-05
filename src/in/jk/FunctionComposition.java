package in.jk;

import java.util.function.Function;

public class FunctionComposition {
	
	public static void main(String[] args) {
		
	
		Function<String, String> letterHeader = Letter::addHeader;
		Function<String, String> letter =letterHeader.andThen(Letter::checkSpeling).andThen(Letter::addFooter);
		String letterText = letter.apply("Hi JK ");
		System.out.println(letterText);
		
		
	}
	
	
	

}


class Letter {
	
	public static String addHeader(String text) {
		
		return text+ "Welcome in Lambda Expression";
		
	}
	
public static String checkSpeling(String text) {
		
		return text+ "";
		
	}

public static String addFooter(String text) {
	
	return text+ "End  of  Lambda Expression";
	
}
}
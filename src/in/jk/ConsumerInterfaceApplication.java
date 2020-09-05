package in.jk;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceApplication {
	
	/*
	 
	 Consumer Interface :- Consumer Interface is a functional interface it have one method called 
	 
	 public void accept(T t);
	 
	 Above accept one object generic type T and perform some operation on it .
	  
	 */
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,8,9,8,5);
		Consumer<Integer> consumer = (index)-> System.out.println(list.get(index)*2);
		filter(list, consumer);
	}
	
	
	public static void filter(List<Integer> list, Consumer<Integer> consumer) {
		
		for (int i = 0; i < list.size(); i++) {
			consumer.accept(i);
		}
		

	}

}

package in.jk;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilderApplication {
	
	public static void main(String[] args) {
		
	// Build Stream static method of Stream of() method
	Stream<String> nameStream =	Stream.of("jk", "sha","harsh");
	nameStream.forEach(System.out::println);
	Stream<Integer> salaryStream =	Stream.of(500, 500,600);
	salaryStream.forEach(System.out::println);
	
	
	// create stream by Arrays.stream();
	int [] numbers = {20,30,40};
	IntStream idStream =Arrays.stream(numbers);
	idStream.forEach(System.out::println);
	
	System.out.println();
	
	// Creating Infinite Stream .
	
	Stream.iterate(0, n->n+1)
	                         .limit(10)
	                         .forEach(System.out::println);
	
	
	// Creating fibonacci series with Infinite Stream .

	Stream.iterate(new int[] {0,1},t->new int []{t[1],t[0]+t[1]})
	                                                           .limit(10)
	                                                           .map(t->t[0])
	                                                           .forEach(System.out::println);
	
	System.out.println();
	
	// Generate Stream of infini
	
	Stream.generate(Math::random)
	                             .limit(10).forEach(System.out::println);
		
	}

}

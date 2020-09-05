package in.jk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateMethod {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,4,8,5,5,5,6);
		
		//Use of distinct 
		list.stream()
		              .filter(n->n>2)
		              .distinct().collect(Collectors.toList());
		list.stream()
		              .filter(n->n>2)
		              .distinct().forEach(System.out::print);
		
		

		List<Employee> empList = Employee.getEmployeeList();
		
		// Use of count
		long count =empList.stream().count();
	    System.out.println("List Size :: "+count);
	    
		// Use of limit :- To get first n element .
	    empList.stream().limit(2).forEach(System.out::println);
	    System.out.println();
	 // Use of skip :- To skip first n element .
	    empList.stream().skip(2).forEach(System.out::println);
	    
	    

}
}

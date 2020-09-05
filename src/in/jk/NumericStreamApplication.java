package in.jk;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamApplication {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Employee.getEmployeeList();
		/*
		empList.stream()
		                .map(Employee::getEmpId)
		                 .sum(); // Error with sum() :- method sum() is undefined for the type Stream<String>
		*/
		// Using Numeric stream .
	int sum=empList.stream()
                       .mapToInt(Employee::getEmpId)
                        .sum(); 
	System.out.println("Sum of Id :: "+sum);
	
	
	// Use of IntStream with rangeClosed method.
	IntStream intStream = IntStream.rangeClosed(1, 100);
	intStream.forEach(System.out::print);
	
	}

}

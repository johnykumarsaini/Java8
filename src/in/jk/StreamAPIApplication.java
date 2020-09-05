package in.jk;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIApplication {
	
	/*
	 * 
	Stream API :- In Java 8 Stream API is added .
	
	Stream :- A Stream is sequence of elements from a source that support some data processing operations .
	
	          Source :- Stream source are like collection ,IO Stream .
	          Data processing operations  :- filter,map,sort,collect etc .
	
	*/
	
	public static void main(String[] args) {
		
		List<Employee> empList = Employee.getEmployeeList();
		
		//find the list of Employee name where Employee id is greater then 2
		List<String> list =empList.stream()
		              .filter(emp->emp.getEmpId()>2)
		              .map(Employee::getName)
		              .collect(Collectors.toList());
	
		list.forEach(System.out::println);
		
		//find the sum of Employee id
         int sum =empList.stream()
		               .mapToInt(Employee::getEmpId)
		               .sum();
		 
	    System.out.println("Sum is : "+sum);
	    
	  //find the First of Employee object from list 
	    List<Employee> list2 =empList.stream()
		                    .limit(1)
		                    .collect(Collectors.toList());
	    
	    list2.forEach(System.out::println);
		               
		 
	  
	    
	    
		 
		
		
		
	}

}

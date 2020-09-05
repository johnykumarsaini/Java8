package in.jk;

import java.util.List;
import java.util.Optional;

public class StreamFindingMethodApplication {
	
	public static void main(String[] args) {
		
		List<Employee> empList=	Employee.getEmployeeList();
		
		//Use of findAny() :- This method return any arbitrary element from stream . prefer in parallel stream  
		Employee emp= empList.stream().findAny().get();
		System.out.println(emp);
		/*Use of findfirst() :- in Stream API Some stream have element in in some order 
		                        This method return first element from stream.  less prefer in parallel stream  
		 
		 */
		Employee emp1= empList.stream().findFirst().get();
		System.out.println(emp1);
		
		/*
		 
		 Optional<T> class 
		 
		 Optional<T> class is container class that represent the existence and absence of a value.
		 
		  Optional<T> class have many method to get the from class container .
		  
		  isPresent() :- return true if value present otherwise return false.
		  T get() :- return value if value present otherwise throw java.util.NoSuchElementException.
		  T orElse(T other) :- return value if value present otherwise return default value.
		  
		 */
		
		Optional<Employee> employee = empList.stream().filter(em->em.getCompany().equals("Google")).findAny();
		Employee empl = empList.stream().filter(em->em.getCompany().equals("Youtube")).findAny().orElse(null);
		System.out.println("Value by OrElse() "+empl);
		
		try {
			
			Employee employeeObj=employee.get();
			System.out.println(employeeObj);
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
		
	}

}

package in.jk;

import java.util.List;

public class StreamMatchingMethodApplication {
	
	public static void main(String[] args) {
		
		
		List<Employee> empList = Employee.getEmployeeList();
		
		// Use of anyMatch() method return true any object found in stream for given lambda expression otherwise return false.
		boolean isAnyMatch = empList.stream().anyMatch(emp->emp.getCompany().equalsIgnoreCase("APAR"));
		System.out.println("isAnyMatch ::  "+isAnyMatch);
		
		
		// Use of allMatch() method return true all object found in stream for given lambda expression otherwise return false.
		boolean isAllMatch = empList.stream() .filter(emp->emp.getCompany().equalsIgnoreCase("APAR")).allMatch(emp->emp.getCompany().equalsIgnoreCase("APAR"));
		System.out.println("isAllMatch :: "+isAllMatch);
				
				
	   // Use of noneMatch() method return true all object found in stream for given lambda expression otherwise return false.
		boolean noneMatch = empList.stream().noneMatch(emp->emp.getCompany().equalsIgnoreCase("Alphabet"));
		System.out.println("noneMatch :: "+noneMatch);
		
		
		
	}

}

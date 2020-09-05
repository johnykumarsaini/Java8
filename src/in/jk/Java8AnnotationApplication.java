package in.jk;

import java.util.Iterator;
import java.util.List;

public class Java8AnnotationApplication {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Employee.getEmployeeList();
		Iterator<Employee > iterator=empList.iterator();
		
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
			
			empList.remove(employee); // Throws java.util.ConcurrentModificationException 
		}
		
	}

}

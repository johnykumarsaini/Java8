package in.jk;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApplication {
	
	/*
	 * 
	 Predicate Functional Interface :- Predicate Functional interface have one method 
	 public boolean test(T t); 
	 
	 +it check object equality and return true if object is equal or false.
	
	 
	 */

	public static void main(String[] args) {

		List<Employee> empList = Employee.getEmployeeList();
        Predicate<Employee> predicate = (emp) -> "GOOGLE".equalsIgnoreCase(emp.getCompany());
        List<Employee> employees = filter(empList, predicate);
        employees.forEach(System.out::println);

	}

	public static List<Employee> filter(List<Employee> empList, Predicate<Employee> predicate) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Employee employee : empList) {
			if (predicate.test(employee)) {
				employees.add(employee);
			}
		}

		return employees;

	}

}

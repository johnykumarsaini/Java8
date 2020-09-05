package in.jk;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambdaExpression {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Employee.getEmployeeList();
		Comparator<Employee> nameComparator = (emp1,emp2)->emp1.getName().compareTo(emp2.getName());
		/*
		Collections.sort(empList, nameComparator);
		empList.forEach(System.out::println);
		Comparator<Employee> nameComparatorWithMethodReference = Comparator.comparing(Employee::getName);
        Collections.sort(empList, nameComparatorWithMethodReference);
		empList.forEach(System.out::println);
		
		*/
		
		Comparator<Employee> nameComparatorWithMethodReference = Comparator.comparing(Employee::getEmpId)
				                                                           .reversed()
				                                                           .thenComparing(Employee::getName);
        Collections.sort(empList, nameComparatorWithMethodReference);
		empList.forEach(System.out::println);
		
		
		
		
		
		//Comparator<Employee> idComparator = (emp1,emp2)->if(emp1.getEmpId()==emp2.getName()) );
				
				
//		if(emp1.getEmpId()==emp2.getName()) {
//			return 0;
//		}
//			else if(emp1.getEmpId()>emp2.getEmpId())  {
//				return 1;
//				
//			}else {
//				return -1;
//			}
		
	
		
		
	}

}

package in.jk;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredefinedCollectorApplication {
	
	public static void main(String[] args) {
		
		
		List<Employee> empList = Employee.getEmployeeList();
		
		// Use of GroupBy Collector for grouping of employee by company name
		Map<String ,List<Employee>> map =empList.stream().collect(Collectors.groupingBy(Employee::getCompany));
		System.out.println(map);
		System.out.println();
		
		Long count =empList.stream().collect(Collectors.counting());
		System.out.println("Count :: "+count);
		
		IntSummaryStatistics intSummaryStatistics =empList.stream().collect(Collectors.summarizingInt(Employee::getEmpId));
		System.out.println("IntSummaryStatistics :: "+intSummaryStatistics);
		double avg= empList.stream().collect(Collectors.averagingInt(Employee::getEmpId));
		
		System.out.println("Average of Id :: "+avg);

	   Employee maxEmployee = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpId))).orElse(null);
	   System.out.println("Max Id Employee "+maxEmployee);
	   
	   Employee minEmployee = empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getEmpId))).orElse(null);
	   System.out.println("Min id Employye :: "+minEmployee);
	   
	   int employeeIdSum = empList.stream().collect(Collectors.summingInt(Employee::getEmpId));
	   System.out.println("Employee Id Sum  :: "+employeeIdSum);
	   
	   // Use of joining Collector
	   String employeeNames = empList.stream()
			                                .map(Employee::getName)
			                                .collect(Collectors.joining(","));
	   System.out.println("Employee names  :: "+employeeNames);
		
		
		
	   //Use of Reduce Collector 
	  int sumOfIdbyReduce= empList.stream().collect(Collectors.reducing(0,Employee::getEmpId,(i,j)->i+j));
	  System.out.println("Sum Of Id by Reduce :: "+sumOfIdbyReduce);
	  
	  //Use of Reduce Collector 
	  Employee maxIdEmployeebyReduce= empList.stream().collect(Collectors.reducing((id1,id2)->id1.getEmpId()>id2.getEmpId()?id1:id1)).orElse(null);
	  System.out.println("Sum Of Id by Reduce :: "+maxIdEmployeebyReduce);
	  
	  
	 String joinNamewithReduce= empList.stream().map(Employee::getName).collect(Collectors.reducing((s1,s2)->s1+s2)).orElse(null);
	 System.out.println("Join Name with Reduce :: "+joinNamewithReduce);
	 
	 
	 String joinNamewithReduce1= empList.stream().collect(Collectors.reducing(" +",Employee::getName,(s1,s2)->s1+s2));
	 System.out.println("Join Name with Reduce :: "+joinNamewithReduce1);
	 
	 
	 //Use  of partitioningBy Collector 
	 Map<Boolean,List<Employee>> partitioningMap= empList.stream().collect(Collectors.partitioningBy(emp->emp.getEmpId()>5));
	 System.out.println("Partitioning Map :: "+partitioningMap);
	  
	  
		
	}

}

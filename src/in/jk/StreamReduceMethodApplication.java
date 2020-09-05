package in.jk;

import java.util.Arrays;
import java.util.List;

public class StreamReduceMethodApplication {
	
	public static void main(String[] args) {
		
		
		List<Employee> empList = Employee.getEmployeeList();
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,10,9);
		
		
		
		
		int sum1 = list.stream().reduce(0, (a,b)->a+b);
		System.out.println("Sum by reduce() and Lambda "+sum1);
		
		int sum2 = list.stream().reduce(0,Integer::sum);
		System.out.println("Sum by reduce()  and method refernce "+sum2);
		
		int sum3 = list.stream().reduce(Integer::sum).orElse(0);
		System.out.println("Sum by reduce() and method refernce  as Optional return "+sum3);
		
		int max1 = list.stream().reduce(Integer::max).orElse(0);
		System.out.println("Max by reduce() and method refernce  as Optional return "+max1);
		
		int min1 = list.stream().reduce(Integer::min).orElse(0);
		System.out.println("min by reduce() and method refernce  as Optional return "+min1);
		
		
		int max2 = list.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println("Max by reduce() and method refernce  as Optional return "+max1);
		
		int min2 = list.stream().reduce(0,(a,b)->a<b?a:b);
		System.out.println("min by reduce() and method refernce  as Optional return "+min1);
		 
		 
		
	}

}

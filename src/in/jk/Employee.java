package in.jk;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int empId;
	private String name;
	private String company;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", company=" + company + "]";
	}
	
	
	public static  List<Employee>getEmployeeList() {
		
		List<Employee> empList =new ArrayList<Employee>();
		
		Employee  employee = new Employee();
        employee.setEmpId(1);
        employee.setName("J K");
        employee.setCompany("Google");
        
        Employee  employee1 = new Employee();
        employee1.setEmpId(2);
        employee1.setName("J K");
        employee1.setCompany("Google");
        
        
        Employee  employee2 = new Employee();
        employee2.setEmpId(3);
        employee2.setName("J K");
        employee2.setCompany("Google");
        
        Employee  employee3 = new Employee();
        employee3.setEmpId(4);
        employee3.setName("SHA");
        employee3.setCompany("APAR");
        
        Employee  employee4 = new Employee();
        employee4.setEmpId(5);
        employee4.setName("HM");
        employee4.setCompany("PAYTM");
        
        Employee  employee5 = new Employee();
        employee5.setEmpId(5);
        employee5.setName("HM");
        employee5.setCompany("APAR");
        
        Employee  employee6 = new Employee();
        employee6.setEmpId(6);
        employee6.setName("JK");
        employee6.setCompany("APAR");
        
        Employee  employee7 = new Employee();
        employee7.setEmpId(7);
        employee7.setName("JK");
        employee7.setCompany("JET BRAINS");
        
        
        Employee  employee8 = new Employee();
        employee8.setEmpId(8);
        employee8.setName("AJ");
        employee8.setCompany("APAR");
        
        
        Employee  employee9 = new Employee();
        employee9.setEmpId(8);
        employee9.setName("AJ");
        employee9.setCompany("ADOBE");
        

        empList.add(employee);
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);
        empList.add(employee6);
        empList.add(employee7);
        empList.add(employee8);
        empList.add(employee9);
		
		
		return empList;
		
	}


}

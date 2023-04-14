package java8.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		 employeeList.add(new Employee(111, "Ram", "Hyderbad", 25000.0));
		 employeeList.add(new Employee(222, "Hari", "Hyderbad", 35000.0));
		 employeeList.add(new Employee(333, "Raghab", "Hyderbad", 15000.0));
		 employeeList.add(new Employee(444, "Surya", "Hyderbad", 50000.0));
		
		 employeeList.forEach(System.out::println);
	}

}

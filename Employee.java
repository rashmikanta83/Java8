package java8.employee;

public class Employee {

	int id;
	String name;
	String address;
	double sal;
	
	public Employee(int id, String name, String address, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}

}
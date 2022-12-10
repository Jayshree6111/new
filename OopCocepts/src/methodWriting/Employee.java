package methodWriting;

public class Employee {
	int id = 100;
	String name = "Jayshree";
	String city = "Ulhasnagar";
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Employee addEmployee() {
		Employee emp = new Employee();
		System.out.println(emp);
		return emp;
	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.addEmployee();
}
}

	
	
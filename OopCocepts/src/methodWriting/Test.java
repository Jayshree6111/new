package methodWriting;

public class Test {
	public static Employee getEmployeeId() {
		int id = 10;
		return new Employee();
	}
public static void main(String[] args) {
	Employee e = getEmployeeId();
	System.out.println(e.id);
	System.out.println(e);
}
}

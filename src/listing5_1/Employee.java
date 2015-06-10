package listing5_1;

public class Employee
{
	/**
	 * Employee's name
	 * @deprecated New version uses firstName and lastName fields.
	 */
	String name;
	String firstName;
	String lastName;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		Employee emp = new Employee("John Doe");
		emp.name = "John Doe";
	}

	public String getName() {
		return name;
	}

}

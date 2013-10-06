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

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "John Doe";
	}

}

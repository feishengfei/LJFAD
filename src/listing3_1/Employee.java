package listing3_1;

public class Employee implements Cloneable {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("John Doe", 46);
		Employee e2 = (Employee)e1.clone();
		System.out.println(e1 == e2);
		System.out.println(e1.getName().endsWith(e2.getName()));
	}
	
}

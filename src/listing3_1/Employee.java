package listing3_1;

class Date
{
	int year, month, day;
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void dump() {
		System.out.print(this.year + " " + this.month + " " + this.day);
	}
}

public class Employee implements Cloneable {
	private String name;
	private int age;
	Date hireDate;
	
	public Employee(String name, int age, Date hireDate) {
		super();
		this.name = name;
		this.age = age;
		this.hireDate = hireDate;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee)super.clone();
		if (hireDate != null) {
			emp.hireDate = new Date(hireDate.year, hireDate.month, hireDate.day);
		}
		return emp;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("John Doe", 46, new Date(2000, 1, 20));
		Employee e2 = (Employee)e1.clone();
		System.out.println(e1 == e2);
		System.out.println(e1.getName().endsWith(e2.getName()));
		System.out.println(e1.getName() == (e2.getName()));
		System.out.println(e1.hireDate == e2.hireDate);
		e2.hireDate.dump();
	}
	
}

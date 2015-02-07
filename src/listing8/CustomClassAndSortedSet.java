package listing8;

import java.util.SortedSet;
import java.util.TreeSet;

public class CustomClassAndSortedSet
{

	public static void main(String[] args)
	{
		SortedSet<Employee> sse = new TreeSet<Employee>();
		sse.add(new Employee("Sally Doe"));
		sse.add(new Employee("Bob Doe"));
		sse.add(new Employee("John Doe"));
		System.out.println(sse);
	}

}

class Employee
{
	private String name;

	public Employee(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}
	
	
}

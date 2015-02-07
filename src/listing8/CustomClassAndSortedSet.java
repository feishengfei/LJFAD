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
		Employee e1 = new Employee("John Doe");
		Employee e2 = new Employee("John Doe");
		sse.add(e1);
		sse.add(e2);
		System.out.println(sse);
		System.out.println(e1.equals(e2));
	}

}

class Employee implements Comparable<Employee>
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
	
	

	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Employee))
			return false;
		Employee e = (Employee)obj;
		return e.name.equals(name);
	}

	@Override
	public int compareTo(Employee e)
	{
		return name.compareTo(e.name);
	}
	
	
}

package listing8;

public class Employee implements Comparable<Employee>
{
	private String name = "";
	private int age = 0;

	public Employee(String name)
	{
		super();
		this.name = name;
	}

	public Employee(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "[" + name + " " + age + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Employee))
			return false;
		Employee e = (Employee)obj;
		return e.name.equals(name) && e.age == age;
	}

	@Override
	public int hashCode()
	{
		int hashCode = 19;
		hashCode = hashCode*31 + name.hashCode();
		hashCode = hashCode*31 + age;
		return hashCode;
	}

	@Override
	public int compareTo(Employee e)
	{
		return name.compareTo(e.name);
	}
	
	
}

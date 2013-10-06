package listing5_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoClassCastException
{
	public static void main(String[] args) {
		List employees = new ArrayList();
		employees.add(new Employee("John Doe"));
		employees.add(new Employee("Jane Doe"));
		employees.add("Doe Doe");
		Iterator iter = employees.iterator();
		while(iter.hasNext()) {
			Employee emp = (Employee)iter.next();
			System.out.println(emp.getName());
		}
	}
}

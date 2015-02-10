package listing8;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo
{
	public static void main(String[] args)
	{
		Map<Employee, String> map1 = new IdentityHashMap<Employee, String>();
		Map<Employee, String> map2 = new HashMap<Employee, String>();
		
		Employee e1 = new Employee("John Doe", 28);
		map1.put(e1, "SALES");
		System.out.println(map1);
		
		Employee e2 = new Employee("Jane Doe", 26);
		map2.put(e2, "MGMT");
		System.out.println(map2);
		
		System.out.println("map1 contains key e1 = " + map1.containsKey(e1));
		System.out.println("map2 contains key e2 = " + map2.containsKey(e2));
		
		e1.setAge(29);
		e2.setAge(27);
		System.out.println(map1);
		System.out.println(map2);
		
		System.out.println("map1 contains key e1 = " + map1.containsKey(e1));
		System.out.println("map2 contains key e2 = " + map2.containsKey(e2));
	}

}

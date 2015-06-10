package listing8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo
{

	public static void main(String[] args)
	{
		SortedMap<String, Integer> smsi = new TreeMap<String, Integer>();
		String[] officeSupplies = 
			{
				"pen", "pencil", "legal pad", "CD", "paper"
			};
		int[] quantities =
			{
				20, 30, 5, 10, 20
			};
		
		for (int i = 0; i < officeSupplies.length; i++)
			smsi.put(officeSupplies[i], quantities[i]);
		
		System.out.println(smsi);
		System.out.println(smsi.headMap("pencil"));
		System.out.println(smsi.headMap("paper"));
		
		SortedMap<String, Integer>smsiCopy;
		Comparator<String> cmp = new Comparator<String>()
		{

			@Override
			public int compare(String o1, String o2)
			{
				return o2.compareTo(o1);
			}
		};
		smsiCopy = new TreeMap<String, Integer>(cmp);
		smsiCopy.putAll(smsi);
		System.out.println(smsiCopy);
	
		
	}

}

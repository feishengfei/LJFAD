package listing8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArraysUtilDemo {
	public static void main(String[] args) {
		asListDemo();
		binarysearchDemo();
		sortLongDemo();
		sortComparatorDemo();
	}

	private static <T> void dumpArray(T[] t) {
		System.out.print("Arrays:");
		for (int i = 0; i < t.length; i++) {
			System.out.print(" " + t[i]);
		}
		System.out.println();
		
	}

	private static void sortComparatorDemo() {
		String[] innerPlanets = {"Mercury", "Venus", "Earth", "Mars" };
		dumpArray(innerPlanets);
		Comparator<String> cmp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		};
		Arrays.sort(innerPlanets, cmp);
		dumpArray(innerPlanets);
	}
	
	

	private static void sortLongDemo() {
		Long[] lArray = new Long[] {200000L, 89L, 66L, 33L};
		
		dumpArray(lArray);
		Arrays.sort(lArray);
		dumpArray(lArray);
	}

	private static void binarysearchDemo() {
		String[] ss = new String[] {"Robin", "Oriole", "Bluejay"};
		int index_of_Oriole = Arrays.binarySearch(ss, "Oriole");
		System.out.println("index_of_Oriole == " + index_of_Oriole);
	}
	

	public static void asListDemo() {
		List<String> l = Arrays.asList(new String[]{"Larry", "moe", "Curly", "Jane"});
		
		for(String s : l) {
			System.out.println(s);
		}
		
		for(Iterator<String> it = l.iterator(); it.hasNext();) {
			System.out.println("iterator: " +  it.next());
		}
		
	}
	
	
}

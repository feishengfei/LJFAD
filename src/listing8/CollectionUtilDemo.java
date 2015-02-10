package listing8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionUtilDemo {

	public static void main(String[] args) {
		minDemo();
		System.out.println();
		reverseDemo();
		System.out.println();
		useSingletonListToRemoveNullDemo();
	}

	private static void useSingletonListToRemoveNullDemo() {
		List l = new ArrayList<String>();
		l.add(null);
		l.add("a");
		l.add("a");
		l.add("b");
		l.add(null);
		l.add("c");
		dumpCollection(l);
		l.removeAll(Collections.singletonList(null));
		dumpCollection(l);
		l.removeAll(Collections.singletonList("a"));
		dumpCollection(l);
	}

	private static void dumpCollection(List l) {
		System.out.print("List:");
		for(Iterator it = l.iterator(); it.hasNext();) {
			System.out.print(" " + it.next());
		}
		System.out.println();
	}

	private static void reverseDemo() {
		List<String> birds = 
			Arrays.asList("Robin", "Oriole", "Bluejay");
		
		System.out.println(birds);
		Collections.reverse(birds);
		System.out.println(birds);
		
	}

	private static void minDemo() {
		List li= Arrays.asList(10, 3, 18, 25);
		System.out.println("min of 10, 3, 18, 25 is " + 
			Collections.min(li));
		System.out.println("max of 10, 3, 18, 25 is " + 
			Collections.max(li));
	}

}

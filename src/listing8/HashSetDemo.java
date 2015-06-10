package listing8;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> ss = new HashSet<String>();
		String[] fruits = {"apples", "pears", "grapes", "bananas", "kiwis"};
		for (String fruit:fruits) {
			ss.add(fruit);
		}
		ss.add(null);
		TreeSetDemo.dump("ss:", ss);
	}

}

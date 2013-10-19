package listing5_1;

import java.util.ArrayList;
import java.util.List;

public class DemoShow
{
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("first");
		ls.add("second");
		ls.add("third");
		outputList(ls);
		
		List<String> ls2 = new ArrayList<String>();
		copyList(ls, ls2);
		outputList(ls2);
	}

	private static void copyList(List<String> ls, List<String> ls2) {
		for (int i = 0; i < ls.size(); i++) {
			ls2.add(ls.get(i));
		}
	}

	private static void outputList(List<?> ls) {
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
	}

}

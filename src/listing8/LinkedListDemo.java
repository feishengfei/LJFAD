package listing8;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> ls = new LinkedList<String>();
		String[] weekDays = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		for (String weekDay:weekDays) {
			ls.add(weekDay);
		}
		dump("ls:", ls);
		ls.add(1, "周日");
		ls.add(3, "周一");
		ls.add(5, "周二");
		ls.add(7, "周三");
		ls.add(9, "周四");
		ls.add(11, "周五");
		ls.add(13, "周六");
		dump("ls:", ls);
		ListIterator<String> li = ls.listIterator(ls.size());
		while(li.hasPrevious()) {
			System.out.print(li.previous() + " ");
		}
		System.out.println();
	}
		
	static void dump(String title, List<String> ls) {
		System.out.print(title + " ");
		for (String s:ls)
			System.out.print(s + " ");
		System.out.println();
	}

}

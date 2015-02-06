package listing8;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;



public class EnumSetDemo {
	
	public static void main(String[] args) {
		Set<Weekday> daysOff = EnumSet.of(Weekday.SUNDAY, Weekday.MONDAY);
		Iterator<Weekday> iter = daysOff.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

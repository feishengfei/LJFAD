package listing8;

import java.util.Set;
import java.util.TreeSet;

enum Weekday
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	STATUDAY
}

public class DaysOff 
{
	public static void main(String[] args) {
		Set<Weekday> daysOff = new TreeSet<Weekday>();
		daysOff.add(Weekday.SUNDAY);
		daysOff.add(Weekday.MONDAY);
		System.out.println(daysOff);
	}
}

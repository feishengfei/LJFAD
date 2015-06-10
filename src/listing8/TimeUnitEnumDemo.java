package listing8;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TimeUnitEnumDemo
{

	public static void main(String[] args)
	{
		System.out.println(TimeUnit.DAYS);
		
		Map<TimeUnit, Integer> map = new EnumMap<TimeUnit, Integer>(TimeUnit.class);
		map.put(TimeUnit.DAYS, 24*3600);
		map.put(TimeUnit.HOURS, 3600);
		map.put(TimeUnit.MINUTES, 60);
		map.put(TimeUnit.SECONDS, 1);
		System.out.println(map);
	}

}

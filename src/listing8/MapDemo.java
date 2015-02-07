package listing8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo
{

	public static void main(String[] args)
	{
		Map<String, Color> colorMap = new HashMap<String, Color>();
		colorMap.put("red", Color.RED);
		colorMap.put("blue", Color.BLUE);
		colorMap.put("green", Color.GREEN);
		
		colorMap.put("RED", Color.RED);
		colorMap.put("BLUE", Color.BLUE);
		colorMap.put("GREEN", Color.GREEN);
		
		System.out.println("KEYS");
		for(String colorKey:colorMap.keySet())
			System.out.println(colorKey);
		System.out.println();
		
		System.out.println("VALUES");
		Collection<Color> colorValues = colorMap.values();
		for(Iterator<Color> it = colorValues.iterator(); it.hasNext(); )
			System.out.println(it.next());
		System.out.println();
		
		System.out.println("KEY-VALUES");
		Set<Map.Entry<String, Color>> kvs = colorMap.entrySet();
		for(Iterator<Map.Entry<String, Color>> kvit = kvs.iterator(); kvit.hasNext();){
			Map.Entry<String, Color> kv = kvit.next();
			System.out.println("K\n" + kv.getKey());
			System.out.println("V\n" + kv.getValue());
		}
	}

}

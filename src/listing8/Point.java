package listing8;

import java.util.HashMap;
import java.util.Map;

public class Point
{
	private int x, y;
	

	public Point(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}
	
	@Override
	public int hashCode()
	{
		int hashCode = 19;
		int hc = x;
		hashCode = hashCode*31 + hc;
		hc = y;
		hashCode = hashCode*31 + hc;
		return hc;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Point))
			return false;
		Point p = (Point)obj;
		return p.x == x && p.y == y;
	}
	
	

	public static void main(String[] args)
	{
		Point p1 = new Point(10, 20);
		Point p2 = new Point(20, 30);
		Point p3 = new Point(10, 20);
		
		System.out.println("Test Reflexivity");
		System.out.println(p1.equals(p1));
		
		System.out.println("Test Symmetry");
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		
		System.out.println("Test Transitivity");
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));
		
		System.out.println("Test Nullability");
		System.out.println(p1.equals(null));
		
		System.out.println();
		System.out.println(p1.equals("abc"));
		Map<Point, String> map = new HashMap<Point, String>();
		map.put(p1, "first point");
		System.out.println(map.get(p1));
		System.out.println(map.get(new Point(10, 20)));
	}

}

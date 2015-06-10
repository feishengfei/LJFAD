package listing5_1;

import java.util.ArrayList;
import java.util.List;

class Ring 
{
	private double x, y, radius;

	public Ring(double x, double y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + radius + ")";
	}
}

public class CopyList
{

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		outputList(ls);
		
		List<String> lsCopy = new ArrayList<String>();
		copyList(ls, lsCopy);
		outputList(lsCopy);
		
		List<Ring> lr = new ArrayList<Ring>();
		lr.add(new Ring(10.0, 20.0, 30.0));
		lr.add(new Ring(5.0, 4.0, 16.0));
		outputList(lr);
		
		List<Ring> lrCopy = new ArrayList<Ring>();
		copyList(lr, lrCopy);
		outputList(lrCopy);

	}
	
	static <T> void copyList(List<T> c1, List<T> c2) {
		for (int i=0; i < c1.size(); i++) {
			c2.add(c1.get(i));
		}
	}
	
	static void outputList(List<?> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
	}

}

package listing8;

import java.util.HashSet;
import java.util.Set;

public class CustomClassAndHashSetDemo {

	public static void main(String[] args) {
		Set<Planet> sp = new HashSet<Planet>();
		sp.add(new Planet("Mercury"));
		sp.add(new Planet("Venus"));
		sp.add(new Planet("Earth"));
		sp.add(new Planet("Mars"));
		sp.add(new Planet("Jupiter"));
		sp.add(new Planet("Saturn"));
		sp.add(new Planet("Uranus"));
		sp.add(new Planet("Neptune"));
		sp.add(new Planet("Fomalhaut b"));
		
		Planet p1 = new Planet("51 Pegasi b");
		if(sp.add(p1)) System.out.println("add 51 Pegasi b");
		Planet p2 = new Planet("51 Pegasi b");
		if(sp.add(p2)) System.out.println("add 51 Pegasi b");
		System.out.println(p1.equals(p2));
		System.out.println(sp);
	}

}

class Planet
{
	private String name;

	public Planet(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Planet))
			return false;
		Planet p = (Planet) obj;
		return p.name.equals(name);
	}

	@Override
	public String toString() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
	
	
	
}
package listing8;

public class AutoboxUnbox
{

	public static void main(String[] args)
	{
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		System.out.println(i1 < i2);
		System.out.println(i1 > i2);
		System.out.println(i1 + i2);
		i1 = 30000;
		i2 = 30000;
		System.out.println(i1 == i2);
		System.out.println(i1 < i2);
		System.out.println(i1 > i2);
		i2 = 300001;
		System.out.println(i1 < i2);
		System.out.println(i1 + i2);
		
		i1 = new Integer(100);
		i2 = new Integer(100);
		System.out.println(i1 == i2);
	}

}

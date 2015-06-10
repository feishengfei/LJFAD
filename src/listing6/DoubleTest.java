package listing6;

public class DoubleTest
{
	public static void main(String[] args)
	{
		System.out.println("Double MAX_EXPONENT: " + Double.MAX_EXPONENT);
		System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
		
		System.out.println("Double MIN_NORMAL: " + Double.MIN_NORMAL);
		
		System.out.println("Double MIN_EXPONENT: " + Double.MIN_EXPONENT);
		System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);
		
		System.out.println("Double NaN: " + Double.NaN);
		
		System.out.println("Double NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY);
		System.out.println("Double POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY);
		
		System.out.println("Double.SIZE: " + Double.SIZE);
		System.out.println("Double.TYPE: " + Double.TYPE);
		
		Double d = new Double("1234567890");
		System.out.println("d:" + d);
	}
}

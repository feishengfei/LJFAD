package listing4_1;

public class ExceptionDemo
{
	public static void convert(String srcName, String dstName) 
	throws InvalidMediaFormatException {
		if (null == srcName)
			throw new NullPointerException("srcName is null");
		if (null == dstName)
			throw new NullPointerException("dstName is null");
		
		String expectedFormat = "RM";
		String existingFormat = "WAVE";
		throw new InvalidMediaFormatException(expectedFormat, existingFormat);
	}
	
	public static double sqrt(double x) {
		if (x < 0)
			throw new IllegalArgumentException(x + " is negative");
		return Math.sqrt(x);
	}
	
	public static void main(String[] args) {
		ExceptionDemo.sqrt(-1);
		try {
			ExceptionDemo.convert(null, "def");
		} catch (InvalidMediaFormatException e) {
			e.printStackTrace();
		}
	}
}

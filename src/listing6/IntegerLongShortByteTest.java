package listing6;

public class IntegerLongShortByteTest
{

	public static void main(String[] args)
	{
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE);
		System.out.println("Long.SIZE: " + Long.SIZE);
		System.out.println();
		
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
		System.out.println("Integer.SIZE: " + Integer.SIZE);
		System.out.println();
		
		System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE);
		System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE);
		System.out.println("Short.SIZE: " + Short.SIZE);
		System.out.println();
		
		System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);
		System.out.println("Byte.SIZE: " + Byte.SIZE);
		System.out.println();
		
		System.out.println("Integer:");
		System.out.println("Integer bin:" + Integer.toBinaryString(255));
		System.out.println("Integer hex:" + Integer.toHexString(255));
		System.out.println("Integer oct:" + Integer.toOctalString(255));
		System.out.println("Integer string:" + Integer.toString(255));
		
		System.out.println("Aligning binary string:");
		System.out.println(toAlignedBinaryString(7, 8));
		System.out.println(toAlignedBinaryString(255, 16));
		System.out.println(toAlignedBinaryString(255, 7));
	}

	static String toAlignedBinaryString(int i, int numBits)
	{
		String result = Integer.toBinaryString(i);
		if (result.length() > numBits)
		{
			return null;
		}
		int numLeadingZeros = numBits - result.length();
		String zerosPrefix = "";
		for (int j = 0; j < numLeadingZeros; j++)
			zerosPrefix += "0";
		
		return zerosPrefix + result;
	}

}

package listing5_1;

/**
 * @author xzhou
 * Listing 5-2 Throwing an assertion err with a detail message
 */
public class AssertionDemo
{
	public static void main(String[] args) {
		int x = 1;
		assert x == 0 : "x = " + x;
	}
}

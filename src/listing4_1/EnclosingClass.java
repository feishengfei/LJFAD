package listing4_1;

public class EnclosingClass {
	private void m(final int x) {
		final int y = x*2;
		class LocalClass {
			int a = x;
			int b = y;
		}
		LocalClass lc = new LocalClass();
		System.out.println(lc.a);
		System.out.println(lc.b);
	}
	
	public static void main(String[] args) {
		EnclosingClass ec = new EnclosingClass();
		ec.m(1);
	}
}

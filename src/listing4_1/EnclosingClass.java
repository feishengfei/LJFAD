package listing4_1;

public class EnclosingClass {
	private int i;
	
	private void m1() {
		System.out.println(i);
	}
	
	public class EnclosedClass {
		public void accessEnclosingClass() {
			i = 1;
			m1();
		}
	}
	
	public static void main(String[] args) {
		EnclosingClass ec = new EnclosingClass();
		ec.new EnclosedClass().accessEnclosingClass();
	}
}

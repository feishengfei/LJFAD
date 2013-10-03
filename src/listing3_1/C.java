package listing3_1;

class A {
}
class B extends A {
	void d() {

	}
}
public class C {
	public static void main(String[] args) {
		A a = new A();
		if (a instanceof B ) {
			B b = (B)a;
			b.d();
		}
		B b = new B();
		System.out.println(b instanceof A);
		System.out.println(a instanceof A);
	}
}

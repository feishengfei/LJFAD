package listing3_1;

public class Circle extends Point {
	private int radius;
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "" + radius;
	}
	
	@Override
	void draw() {
		System.out.println("Circle drawn at " + super.toString() 
				+ " with radius " + toString());
	}
	
	public static void main(String[] args) {
		Point[] points = new Point[] {
			new Circle(10, 20, 30),
			new Point(10, 20),
		};
		for (int i = 0; i < points.length; i++)
			points[i].draw();
	}
}

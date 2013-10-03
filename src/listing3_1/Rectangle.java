package listing3_1;

public class Rectangle extends Shape{
	private int x, y;
	private int width, height;
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	void draw() {
		System.out.println("Rectangel at" + "(" + x + ", " + y 
				+ ") with width = " + width + ", height = " + height);
	}
	
}

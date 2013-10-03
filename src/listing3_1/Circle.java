package listing3_1;

public class Circle extends Point implements Drawable, Fillable {
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
	public void draw(int color) {
		System.out.println("Circle drawn at " + super.toString() 
				+ " with radius " + toString() 
				+ " in color " + color);
	}
	
	@Override
	public void fill(int color) {
		System.out.println("Circle Fill at " + super.toString() 
				+ " with radius " + toString() 
				+ " in color " + color);
	}
	
	public static void main(String[] args) {
		//Drawable array
		Drawable[] drawables = new Drawable[] {
			new Point(10, 20),
			new Circle(10, 20, 30),
		};
		for (int i = 0; i < drawables.length; i++)
			drawables[i].draw(Drawable.RED);
		
		//Fillable array
		Fillable[] fillables = new Fillable[] {
			new Point(10, 20),
			new Circle(10, 20, 30),
		};
		for (int i = 0; i < fillables.length; i++)
			fillables[i].fill(Fillable.RED);
	}
}

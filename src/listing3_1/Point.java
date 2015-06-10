package listing3_1;

public class Point implements Drawable, Fillable{
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	@Override
	public void draw(int color) {
		System.out.println("Point drawn at " + toString() + " in color "+ color);
	}

	@Override
	public void fill(int color) {
		System.out.println("Point fill at " + toString() + " in color "+ color);
		
	}
}

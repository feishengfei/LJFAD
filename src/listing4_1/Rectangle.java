package listing4_1;

public abstract class Rectangle {
	public abstract double getX();
	public abstract double getY();
	public abstract double getWidth();
	public abstract double getHeight();

	public static class Double extends Rectangle {
		private double x, y, width, height;

		public Double(double x, double y, double width, double height) {
			super();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		@Override
		public double getX() {
			return x;
		}

		@Override
		public double getY() {
			return y;
		}

		@Override
		public double getWidth() {
			return width;
		}

		@Override
		public double getHeight() {
			// TODO Auto-generated method stub
			return height;
		}
	}
	public static class Float extends Rectangle {
		private float x, y, width, height;

		public Float(float x, float y, float width, float height) {
			super();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		@Override
		public double getX() {
			return x;
		}

		@Override
		public double getY() {
			return y;
		}

		@Override
		public double getWidth() {
			return width;
		}

		@Override
		public double getHeight() {
			return height;
		}
	}

	// Prevent subclassing. Use the type-specific Double and Float
	// implementation subclass classes to instantiate.
	private Rectangle() {}
	public boolean contains(double x, double y) {
		return (x >= getX() && x < getX()+getWidth()) 
		&& (y >= getY() && y < getY()+getHeight());
	}
	@Override
	public String toString() {
		return "Rect:(" + getX() + ", " + getY() 
		+ "), width = " + getWidth() 
		+ ", height = " + getHeight();
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle.Double(10.0, 10.0, 20.0, 30.0);
		System.out.println(r);
		System.out.println("contains(15.0, 15.0 = " 
				+ r.contains(15.0, 15.0));
		System.out.println("contains(0.0, 0.0 = " 
				+ r.contains(0.0, 0.0));
		
		r = new Rectangle.Float(10.0f, 10.0f, 20.0f, 30.0f);
		System.out.println(r);
		System.out.println("contains(15.0, 15.0 = " 
				+ r.contains(15.0, 15.0));
		System.out.println("contains(0.0, 0.0 = " 
				+ r.contains(0.0, 0.0));
	}

}

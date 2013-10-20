package listing5_1;

class Point
{
	int x, y;
}

class ColorPoint extends Point
{
	int color;
}

public class ReificationDemo
{

	public static void main(String[] args) {
		ColorPoint[] cptArray = new ColorPoint[1];
		Point[] ptArray = cptArray;
		ptArray[0] = new Point();
	}

}

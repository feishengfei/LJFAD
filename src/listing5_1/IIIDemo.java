package listing5_1;

public class IIIDemo
{
	final static int NORTH = 0;
	final static int SOUTH = 1;
	final static int EAST = 2;
	final static int WEST = 3;
	public static void main(String[] args) {
		int direction = (int)(Math.random()*5);
		switch (direction) {
		case NORTH :
			System.out.println("traveling north");
			break;
		case SOUTH :
			System.out.println("traveling south");
			break;
		case EAST :
			System.out.println("traveling east");
			break;
		case WEST :
			System.out.println("traveling west");
			break;
		default:
			assert false : "direction = " + direction;
		}
	}
}

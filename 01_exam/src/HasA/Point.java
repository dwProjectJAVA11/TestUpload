package HasA;

public class Point {
	int x, y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	String getXY()
	{
		return ("(" + x + ", " + y + ")");
	}
}

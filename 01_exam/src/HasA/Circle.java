package HasA;

public class Circle extends Shape{
	Point center;		// has a 관계 (포함)
	int r;
	
	public Circle()
	{
		this(new Point(0,0),100);
	}
	
	public Circle(Point center, int r)
	{
		this.center = center;
		this.r = r;
	}
	
	void draw()
	{
		System.out.println("center : " + center.x + ", " + center.y + " /r : " + r);
	}
}

package HasA;

public class Triangle extends Shape{
	
	Point[] p = new Point[3];
	
	public Triangle(Point[] p)
	{
		this.p = p;
	}
	
	void draw()
	{
		System.out.println("p1 = " + p[0].getXY());
		System.out.println("p2 = " + p[1].getXY());
		System.out.println("p1 = " + p[2].getXY());
	}
}

package CLS;

public class Triangle2 {
	int base_line;
	int height;
	
	Triangle2()
	{
		
	}
	
	Triangle2(int base_line, int height)
	{
		this.base_line = base_line;
		this.height = height;
	}
	
	double getArea()
	{
		return (base_line*height)/2;
	}
}

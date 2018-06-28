package CLS;

public class TriangleEx {

	public static void main(String[] args) {
	
		Triangle ex = new Triangle();
		ex.base_line = 10;
		ex.height = 10;
		System.out.println(ex.getArea());
		
		Triangle2 tri = new Triangle2(10,5);
		System.out.println(tri.getArea());

	}

}

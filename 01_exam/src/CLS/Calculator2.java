package CLS;

public class Calculator2 {
	
	// 메소드 오버로딩
	// 매개변수의 타입, 순서 ,갯수가 달라야 함
	
	double areaRectangle(double width)
	{
		return width*width;
	}
	
	double areaRectangle(double width, double height)
	{
		return width*height;
	}	
}

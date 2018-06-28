package CLS;

public class CalculatorEx2 {

	public static void main(String[] args) {

		Calculator2 cal = new Calculator2();
		
		double result = cal.areaRectangle(10);
		System.out.println("정사각형의 넓이 : " + result);
		
		result = cal.areaRectangle(10,20);
		System.out.println("직사각형의 넓이 :" + result);
	}

}

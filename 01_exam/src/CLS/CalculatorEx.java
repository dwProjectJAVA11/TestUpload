package CLS;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		cal.powerOn();
		int result = cal.plus(5, 6);
		System.out.println("Plus Result : "+result);
		
		int x = 10, y = 4;
		double result2 = cal.divide(x, y);
		System.out.println("Divide Result : " + result2);
		
		cal.powerOff();
	}

}

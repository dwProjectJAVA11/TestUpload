package CLS;

public class MathEx {

	public static void main(String[] args) {

		Math obj = new Math();
		obj.a = 10;
		obj.b = 20;

		System.out.println("add : " + obj.add() + " subtract : " + obj.subtract() + " multiply : " + obj.multiply()
				+ " divide : " + obj.divide());

		// obj.c = 30;	// -> 공유하는 변수를 너 것 처럼 사용하지마!
		// obj.d = 40;
		
		Math.c = 30;	// -> '클래스명.변수' 로 사용
		Math.d = 40;
		System.out.println(Math.add(Math.c , Math.d));
		
		Math.c = 40;	// -> '클래스명.변수' 로 사용
		Math.d = 50;
		System.out.println(Math.add(Math.c , Math.d));
		
		
	}

}

package HasA;

public class CarEx {

	public static void main(String[] args) {

		Car car = null;
		Fireengine fe = new Fireengine();
		Fireengine fe2 = null;
		
		fe.water();
		car = fe;	// Car car = new Fireengine();	 자동형변환 된 상황
		
		// fire와 Amb는 Car로 자동 형변환 가능
		//fe2 = car;-> x
		
		fe2 = (Fireengine)car;
		// 자식객체에 CASTING을 대입된다
		
		fe2.drive();

	}

}

package CLS;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Car 인스턴스 생성
		
		Car Car1 = new Car();
		System.out.println("첫번째 Car 객체");
		System.out.println("Company : "+Car1.comapny);
		System.out.println("Model : "+Car1.model);
		System.out.println("MaxSpeed : "+Car1.maxSpeed);
		
		
		Car Car2 = new Car("승용차");
		System.out.println("첫번째 Car 객체");
		System.out.println("Company : "+Car2.comapny);
		System.out.println("Model : "+Car2.model);
		System.out.println("MaxSpeed : "+Car2.maxSpeed);
		
		Car Car3 = new Car("택시","흰색");
		System.out.println("첫번째 Car 객체");
		System.out.println("Company : "+Car3.comapny);
		System.out.println("Model : "+Car3.model);
		System.out.println("MaxSpeed : "+Car3.maxSpeed);
		
		Car Car4 = new Car("자가용","빨강",180);
		System.out.println("첫번째 Car 객체");
		System.out.println("Company : "+Car4.comapny);
		System.out.println("Model : "+Car4.model);
		System.out.println("MaxSpeed : "+Car4.maxSpeed);
		
	}

}

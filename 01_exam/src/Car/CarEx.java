package Car;

public class CarEx {
	public static void main(String[] args) {
		
		// Car객체 생성 = Tire 객체 4개 생성
		Car car = new Car();
		
		for(int i=1;i<=5 ;i++)
		{
			int problemLocation = car.run();
			
			switch(problemLocation)
			{
			case 1:
				System.out.println("앞왼쪽 한국 타이어로 교체");
				car.frontLeftTrie = new HankookTire("앞왼쪽",15);
				break;
				
			case 2 :
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRightTrie = new KumhoTire("앞오른쪽",13);
				break;

			case 3 :
				System.out.println("앞왼쪽 한국 타이어로 교체");
				car.backLeftTrie = new HankookTire("뒤왼쪽",14);
				break;
				
			case 4 :
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.backRightTrie = new KumhoTire("뒤오른쪽",17);
				break;
					
			}
			
			System.out.println("------------------------------------------------");
		}
	}

}

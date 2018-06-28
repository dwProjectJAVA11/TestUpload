package Inter;

public class LendableEx {

	public static void main(String[] args) {

		Lendable ld = new Lendable() {		// 익명 구현 개체
			
			@Override
			public void checkOut(String aborrower, String date) {
				// TODO Auto-generated method stub
				System.out.println("대여");
			}
			
			@Override
			public void checkIn() {
				// TODO Auto-generated method stub
				System.out.println("반납");
			}
		};
		
		ld.checkIn();  
		ld.checkOut("길동", "2");

	}

}

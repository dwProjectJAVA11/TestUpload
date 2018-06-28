package Abs;

public class AccountEx {

	public static void main(String[] args) {
		
		//Account ac = new Account();
		// 1. abstract으로 선언 -> 생성불가
		// 하지만 자식클래스가 선언하면서 new는 하지않더라도 생성자는 호출이된다.

		Account ac = new BonusAccount("bb","dd",10,15);
		
		//BounusAccount ba = new BounusAccount();
		
	}

}

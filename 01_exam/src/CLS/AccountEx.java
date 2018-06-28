package CLS;

public class AccountEx {

	public static void main(String[] args) {

		Account ac1 = new Account();
		ac1.name = "김놀부";
		ac1.accountNum = "111-11";
		ac1.balance = 1000000;
		printAcount(ac1);
		
		Account ac2 = new Account();
		ac2.name = "김흥부";
		ac2.accountNum = "222-22";
		ac2.balance = 100000;
		printAcount(ac2);
		
		Account2 ac3 = new Account2("333-33","김계좌",100000000);
		printAcount(ac3);
		
		
		// static 입장에서는 static아닌 애들은 아직 안 올라와있어서 에러...
		// new로 객체를 잡으면 그 때 메모리에 자리잡게 된다. -> static을 안붙이는 함수는 매개변수를 사용하면 돼
	}

	static void printAcount(Account ac)			// 값의 복사가 일어난다
	{
		System.out.println("계좌주 : " + ac.name);
		System.out.println("계좌 번호 : " + ac.accountNum);
		System.out.println("잔액 : " + ac.balance);
	}
	
	static void printAcount(Account2 ac)			// 값의 복사가 일어난다
	{
		System.out.println("계좌주 : " + ac.name);
		System.out.println("계좌 번호 : " + ac.accountNum);
		System.out.println("잔액 : " + ac.balance);
	}


}

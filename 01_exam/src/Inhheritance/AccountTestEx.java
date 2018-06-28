package Inhheritance;

public class AccountTestEx {

	public static void main(String[] args) {
		
		CheckingAccount obj = new CheckingAccount();
		obj.accountNum = "111-11-2222";
		obj.name = "홍길동";
	//	obj.cardNo = "5555-6666";
		obj.deposit(100000);
		
		int paidAmount = obj.pay("5555-6666", 47000);
		System.out.println("지불액 : " + paidAmount);
		System.out.println("잔액 : "+obj.balance);

	}

}

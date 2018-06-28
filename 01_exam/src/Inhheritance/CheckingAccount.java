package Inhheritance;

public class CheckingAccount extends Account {
	// 은행계좌 클래스가 가지고 있는 필드와 기능을 제외하고
	// 필요한 기능과 필드를 추가한다.
	
	@Override
	void deposit(int money)
	{
		super.deposit(money);
	}

	

	int pay(String cardNo,int amount)
	{
		if(!(this.equals(cardNo)) || (balance < amount) )
		{	
			System.out.println("지불 불가");	
			return 0;
		}
		return withdraw(amount);
	}
}

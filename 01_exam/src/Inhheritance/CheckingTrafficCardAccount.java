package Inhheritance;

public class CheckingTrafficCardAccount extends CheckingAccount {

	boolean hasTrafficCard;
	
	int payTrafficCard(String Cardno, int amount)
	{
		if(!hasTrafficCard)
		{
			System.out.println("교통카드 기능이 없습니다.");
			return 0;
		}
		return pay(Cardno, amount);
	}
	
}

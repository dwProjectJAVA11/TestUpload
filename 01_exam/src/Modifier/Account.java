package Modifier;

public class Account {

	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	int getBalance()
	{		
		return balance;
	}
	
	int setBalance(int newbal)
	{
		if (newbal < MIN_BALANCE || newbal > MAX_BALANCE )
		{
			return balance;
		}
		else balance = newbal; return balance;
	}
}

package CLS;

public class Account {
	
	String accountNum;
	String name;
	int balance;
	
	Account()
	{
		
	}
	
	void deposit(int money)
	{
		balance += money;
	}

	int withdraw(int money)
	{	
		if(balance < money)	return 0;

		balance -= money;
		return balance;
	}

}


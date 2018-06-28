package CLS;

public class Account2 {
	
	String accountNum;
	String name;
	int balance;
	
	Account2()
	{
		
	}
	
	Account2(String accountNum, String name, int balance)
	{
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
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


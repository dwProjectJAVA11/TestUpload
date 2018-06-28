package Inhheritance;

public class Account {
	
	String accountNum;
	String name;
	int balance;
	
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


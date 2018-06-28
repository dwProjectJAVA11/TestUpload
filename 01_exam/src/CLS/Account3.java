package CLS;

public class Account3 {
	
	String accountNum;
	String name;
	int balance;
	
	
	
	public Account3(String accountNum, String name, int balance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}

	public Account3(String accountNum) {
		super();
		this.accountNum = accountNum;
	}

	public Account3(String accountNum, String name) {
		super();
		this.accountNum = accountNum;
		this.name = name;
	}

	Account3()
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


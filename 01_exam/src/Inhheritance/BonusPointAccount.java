package Inhheritance;

public class BonusPointAccount extends Account{

	int bonusPoint;
	
	@Override
	void deposit(int amount)
	{
		super.deposit(amount);
		bonusPoint = (int)(amount*0.01);
	}
	
	
		
			
			
			
			
			
			
			
			
			
}

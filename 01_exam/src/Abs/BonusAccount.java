package Abs;
public class BonusAccount extends Account {

	int bonusPoint;
	

	public BonusAccount(String accountNo, String owner, int balance, int bonusPoint) {
		// TODO Auto-generated constructor stub
		super(accountNo, owner, balance); 
//		this.bonusPoint = bonusPoint;
	}

	@Override
	public void move() {
		
	}

}

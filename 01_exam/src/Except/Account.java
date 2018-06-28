package Except;

public class Account {
	private int balance;
	
	public int getBalbance()
	{
		return balance;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public void widthdraw(int money) throws Exception
	{
		// 잔액이 인출액보다 적으면 에러메시지 보내시
		// 출력문을 이용하는게 아니라 예외를 발생시킴
		// 예외 발생 -> throw
		
		if( money > balance )
			throw new BalanceinsufficientException("잔액부족");
		/*	사용자 정의 예외
		 	Exception을 상속받아 checkedException으로 만든 후
		 	개발자가 원하는 형태의 예외로 발생시킴
		 */
		
		/* throw new RuntimeException("잔액부족");
		 실행해야 알 수 있는 예외이기 때문에
		 컴파일러가 체크하지 않는다.
		 따라서 코딩 시 빨간 줄로 알려주거나 하지 않고 개발자가 알아서 처리해야 한다. 
		 */
		
		/* throw new Exception("잔액부족");
		 Checked Exception이기 때문에
		 컴파일러가 체크한 후 Exception 처리를 어떻게 할 것인지 알려준다.
		 -> 미리 처리 가능 
		 */
	}
	
}

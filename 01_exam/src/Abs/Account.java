package Abs;

public abstract class Account {
	
	// 추상클래스
	// 객체 생성이 불가하고 추상메소드를 가지고있다.
	// 추상 메소드는 추상 클래스를 상속받은 하위 클래스에서 반드시 오버라이딩을 하도록 만든다.
	
	// 필드선언
	private String accountNo;
	private String owner;
	private int balance;
	
	// 메소드 선언
	public abstract void move();
	public void draw(){	}
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	
}

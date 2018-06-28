package Inhheritance;

public class Cellphone2 {
	String model;
	String color;
	
	public Cellphone2(String model, String color)
	{
		super();
		this.model = model;
		this.color = color;
	}

	void PowerOn()
	{
		System.out.println("전원을 켭니다");
	}
	
	void powerOff()
	{
		System.out.println("Power Off");
	}
	
	void bell()
	{
		System.out.println("Bell~~");
	}
	
	void sendVoice(String msg)
	{
		System.out.println("본인"+msg);
	}
	
	void receiveVoice(String msg)
	{
		System.out.println("상대방"+ msg);
	}
	
	void hangUp()
	{
		System.out.println("전화종료");
	}
	
	
}

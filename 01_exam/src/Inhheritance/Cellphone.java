package Inhheritance;

public class Cellphone {
	String model;
	String color;
	
	void PowerOn()
	{
		System.out.println("전원으 끕니다");
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
		System.out.println("본인");
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

package Abs;

public abstract class Animal {

	public String kind;
	public abstract void sound();

	public Animal()
	{
		System.out.println("animalㅅ생성");
	}
	
	public void breathe()
	{
		System.out.println("숨을 쉽니다.");
	}
	
	
}

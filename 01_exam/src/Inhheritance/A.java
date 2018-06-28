package Inhheritance;

public class A
{
	private String str;
	public String str2;
	
	A()
	{
		
	}
	public void print() 
	{
		System.out.println("출력");
		
	}
	
	public A(String str, String str2) {
		super();
		this.str = str;
		this.str2 = str2;
	}

	public void sum()
	{
		System.out.println("합계");
	}
}

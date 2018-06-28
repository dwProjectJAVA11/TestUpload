package Modifier;

public class Test {
	
	private int a;
	private String str;
	private boolean f;
	
	
	public Test(int a)
	{
		super();
		this.a = a;
	}
	
	public Test(int a, String str) 
	{
		super();
		this.a = a;
		this.str = str;
	}
	
	public boolean isF() 
	{
		return f;
	}

	public void setF(boolean f) 		// boolean은 get이 생성되지 않음
	{		
		this.f = f;
	}

	public int getA() 
	{
		return a;
	}
	
	public void setA(int a) 
	{
		this.a = a;
	}
	
	public String getStr() 
	{
		return str;
	}
	
	public void setStr(String str)
	{
		this.str = str;
	}
	
}

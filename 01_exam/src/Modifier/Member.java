package Modifier;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	Member()
	{		
	}
	
	Member(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	
	String getName()
	{
		return name;
	}
	
	String getID()
	{
		return id;
	}
	
	boolean login(String id,String password)
	{
		if(password.equals("12345"))
			return true;
		else return false;
	}
	
	void logout(String id)
	{
		System.out.println("Logout Complete!");
	}
	
}

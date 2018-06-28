package shop;

public class User {
	
	String name;
	payType payType;
	
	User()
	{
		
	}

	User(String name, payType payType)
	{
		this.name = name;
		this.payType = payType;
	}
	
	String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	payType getPayType()
	{
		return payType;
	}
	
	void setPayType(payType payType)
	{
		this.payType = payType;
	}
	
}

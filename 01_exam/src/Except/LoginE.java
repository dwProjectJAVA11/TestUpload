package Except;

public class LoginE {

	public static void main(String[] args) {
		
		try
		{
			login("white", "12345");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			login("blue","54321");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception
	{
		if(!id.equals("blue"))
		{
			throw new NoExistIDException("존재하지 않는 ID입니다.");
		}
		
		if(!password.equals("54321"))
		{
			throw new BalanceinsufficientException("일치하지 않는 비밀번호입니다.");
		}
	}

}

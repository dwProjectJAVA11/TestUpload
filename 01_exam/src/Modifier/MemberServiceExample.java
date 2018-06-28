package Modifier;

public class MemberServiceExample {
	public static void main(String[] args) {
	
		Member mb = new Member();
		boolean result = mb.login("jong","12345");
		
		if(result)
		{
			System.out.println("Login Complete!");
			mb.logout("hong");
		}
		else System.out.println("Incorrect Password");
	}
}

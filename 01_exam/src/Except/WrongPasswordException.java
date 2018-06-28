package Except;

public class WrongPasswordException extends Exception{
	
	public WrongPasswordException() {}
	public WrongPasswordException(String message) throws Exception 
	{
		super(message);
	}
}

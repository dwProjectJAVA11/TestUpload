package Except;

public class NoExistIDException extends Exception {
	public NoExistIDException() {}
	public NoExistIDException(String message) throws Exception
	{

		super(message);
	}
}

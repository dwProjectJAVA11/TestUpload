package Thread;

public class UserMainThread {

	public static void main(String[] args)
	{
		Calculator cal = new Calculator();

		Thread t1 = new User1(cal);
		t1.start();
		
		Thread t2 = new User2(cal);
		t2.start();
		
	}

}

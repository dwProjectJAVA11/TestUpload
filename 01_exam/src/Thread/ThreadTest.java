package Thread;

public class ThreadTest {

	public static void main(String[] args)
	{
		Runnable r1 = new NumPrint();
		Thread t1 = new Thread(r1);
		
		Runnable r2 = new HanPrint();
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		

		
	}

}

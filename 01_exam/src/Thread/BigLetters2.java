package Thread;

public class BigLetters2 {

	public static void main(String[] args)
	{
		Runnable r1 = new SmallLetters2();
		Thread t1 = new Thread(r1);
		t1.start();
		
		for(int i=0;i<26;i++)
			System.out.println((char)(i+65));
	}

}

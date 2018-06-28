package Thread;

public class BigLetters3 {

	public static void main(String[] args)
	{
		Runnable r1 = new Runnable() {
			
			@Override
			public void run()
			{
				for(char ch = 'a';ch <='z';ch++)
					System.out.println(ch+" ");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		for(char ch = 'A';ch <='Z';ch++)
			System.out.println(ch+" ");
	}

}

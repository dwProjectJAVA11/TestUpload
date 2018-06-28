package Thread;

public class ThreadTest3 {

	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		for(int i=0;i<300;i++)
			System.out.printf("%s", new String("-"));
		long end = 
				System.currentTimeMillis();
	}

}

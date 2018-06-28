package Thread;

public class NumPrint extends Thread{
	
	public NumPrint()
	{
		setName("NumPrint Thread");
	}
	
	
	@Override
	public void run()
	{
		for(int i=0;i<26;i++)
			System.out.print((char)(i+97)+" ");
		super.run();
	}
}

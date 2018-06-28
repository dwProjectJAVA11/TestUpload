package Thread;

public class Calculator {

	private int memory;

	public int getMemory()
	{
		return memory;
	}

	public void setMemory(int n)
	{
		this.memory = n;
		try
		{
			Thread.sleep(2000);
			
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : "+this.memory);
		
	}
}

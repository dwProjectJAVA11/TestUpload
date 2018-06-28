package Thread;

public class User1 extends Thread {

	private Calculator cal;
	Thread t1 = new User1(cal);;
	
	public User1() {
		
	}
	
	public User1(Calculator c)
	{
		this.cal = c;
	}
	
	
	@Override
	public void run()
	{
		cal.setMemory(10);
		super.run();
	}

	}

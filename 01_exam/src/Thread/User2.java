package Thread;

public class User2 extends Thread {

	private Calculator cal;
	Thread t1 = new User2(cal);;
	
	public User2() {
		
	}
	
	public User2(Calculator c)
	{
		this.cal = c;
	}
	
	
	@Override
	public void run()
	{
		cal.setMemory(50);
		super.run();
	}

	}

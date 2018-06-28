package Thread;

public class PiThread extends Thread {

	private SharedArea area;
	
	public PiThread(SharedArea area)
	{
		this.area = area;
	}
	
	@Override
	public void run()
	{
		double total = 0;
		synchronized (area) {
		for(int cnt = 1;cnt<10000000;cnt+=2)
		{
			if(cnt/2%2 == 0)
				total +=1.0/cnt;
			else
				total -= 1.0/cnt;
		}
		area.setResult(total*4);
	}
	}
}

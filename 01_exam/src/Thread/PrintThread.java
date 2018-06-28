package Thread;

import org.omg.Messaging.SyncScopeHelper;

public class PrintThread extends Thread {

	private SharedArea area;

	PrintThread(SharedArea area)
	{
		this.area = area;
	}

	@Override
	public void run()
	{
		synchronized (area)
		{
			System.out.println(area.getResult());
		}
	}
}

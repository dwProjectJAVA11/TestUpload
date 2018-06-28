package Car;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation)
	{
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll()
	{
		++accumulatedRoatation;
		if(accumulatedRoatation < maxRotation )
		{
			System.out.println(location + "HankookTire수명" + (maxRotation - accumulatedRoatation) + "회");
			return true;
		}
		else {
			System.out.println("***" + location + "HankookTire펑크 ***" );
			return false;
		}
	}
	
}

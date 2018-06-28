package Inter;

public interface RemoteContol {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public void turnON();
	public void turnOFF();
	public void setVolum(int volume);
	
	default void setMute(boolean mute)
	{
		if(mute)
			System.out.println("무음 처리");
		else	System.out.println("무음 해제");
	}
	
	static void changeBattery()
	{
		System.out.println("건전지 교환");
	}
}

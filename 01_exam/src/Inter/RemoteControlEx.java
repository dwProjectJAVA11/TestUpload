package Inter;

public class RemoteControlEx {
	public static void main(String[] args) {

		TV tv = new TV();
		tv.turnON();
		tv.setVolum(5);
		tv.setMute(false);
		tv.turnOFF();
		
		Audio au = new Audio();
		au.turnON();
		au.setVolum(7);
		au.setMute(false);
		au.turnOFF();
		
		RemoteContol rc = new TV();
		rc.turnON();
		rc.setVolum(15);
		rc.setMute(true);
		rc.turnOFF();

		rc = new Audio();
		rc.turnON();
		rc.setVolum(15);
		rc.setMute(true);
		rc.turnOFF();
		
	}
}

package Inter;

public class TV implements RemoteContol {

	private int volume;
	
	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOFF() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setMute(boolean mute) {		
		RemoteContol.super.setMute(mute);
	}

	@Override
	public void setVolum(int volume) {
		// TODO Auto-generated method stub
		this.volume =  volume;
		System.out.println(volume + "으로 볼륨 셋팅");
	}

	
}

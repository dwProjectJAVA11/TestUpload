package Inter;

public class Audio implements RemoteContol {

	private int volume;
	
	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOFF() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolum(int volume) {
		// TODO Auto-generated method stub
		this.volume =  volume;
		System.out.println(volume + "으로 볼륨 셋팅");
	}

}

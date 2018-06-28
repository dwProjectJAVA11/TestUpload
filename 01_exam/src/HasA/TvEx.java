package HasA;

public class TvEx {
	public static void main(String[] args) {
		
		// 1. LgTv tv = new LgTv();
		LgTv tv = new LgTv(new SamsungSpeaker());	// 2. 생성자에서 스피커 new (포함해서 사용할 때에는 new를 한 번은 해야한다.)
		
		tv.powOn();
		
		tv.speaker.volumeUP();
		tv.speaker.voumeDOWN();
		
		tv.PowOff();

	}

}

package HasA;

public class LgTv {
	
	// 1. SamsungSpeaker speaker = new SamsungSpeaker();	//  필드처럼 사용할거야 ->  생성까지 동시에!
	
	// 포함관계일 대 객체를 생성하는 부분이 반드시 보이게 들어가야 함
	
	SamsungSpeaker speaker;
	
	public LgTv(SamsungSpeaker speaker)		// 2. 생성자를 이용한 객체생성
	{
		this.speaker = speaker;
	}
	void powOn()
	{
		System.out.println("PowerON!");
	}
	
	void PowOff()
	{
		System.out.println("PowerOFF!");
	}
	
}

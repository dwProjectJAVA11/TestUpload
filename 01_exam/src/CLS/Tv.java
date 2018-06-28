package CLS;

public class Tv {
	// 속성 -> 변수의 형태로 나타남
	/*	 	1. 색상 	2. 전원상태	3. 채널	*/
	
	String Color;
	boolean Power;
	int Channel;	
	
	// 메소드 -> 동작의 형태로 나타남
	void Power()
	{
		Power =! Power;
	}
		
	void ChannelUp()
	{
		Channel++;
	}
	
	void ChannelDown()
	{
		--Channel;
	}

}
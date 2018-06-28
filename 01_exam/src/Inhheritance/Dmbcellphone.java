package Inhheritance;

public class Dmbcellphone extends Cellphone {
	// DMB기능 추가 
	
	int channel;
	
	void turnOn()
	{
		System.out.print(channel + "방송시작");
	}
	
	void changeChannelDmb(int channel)
	{
		this.channel = channel;
		System.out.println("채널변경 -> "+channel);
	}
	
	void turnOffDMB()
	{
		System.out.println(channel + "방송종료");
	}
	
	
}
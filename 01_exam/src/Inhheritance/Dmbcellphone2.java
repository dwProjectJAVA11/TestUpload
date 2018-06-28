package Inhheritance;

public class Dmbcellphone2 extends Cellphone2 {
	// DMB기능 추가 
	
	int channel;
	
//	public Dmbcellphone2() {
//		super();
//	}
	
	public Dmbcellphone2(String model, String color, int channel) {
		super(model, color);		// -> 명시적으로 쓰지 않아도 기본적으로 호출하도록 되어있다.
//		this.model = model;
//		this.color = color;
		this.channel = channel;
	}

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
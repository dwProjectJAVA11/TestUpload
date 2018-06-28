package CLS;

public class TvEx {
	public static void main(String[] args) {

		// Tv 인스턴스 생성
		Tv tv = new Tv();
		Tv tv2 = new Tv();
		
		
		// Tv 인스턴스 사용
		tv.Channel = 5;
		tv.ChannelDown();
		
		System.out.println("현재 채널은 "+tv.Channel);
		System.out.println("현재 색상은 "+tv.Color);
		System.out.println("현재 전원 상태는 "+tv.Power);
		
	
		tv2.Channel =9;
		tv2.Color = "Red";
		tv2.Power = true;
		tv2.ChannelUp();
		tv2.Power();
		
		
		
		
		
	}

}

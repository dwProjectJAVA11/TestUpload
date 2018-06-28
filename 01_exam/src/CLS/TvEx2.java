package CLS;

public class TvEx2 {

	public static void main(String[] args) {

		Tv2 tv = new Tv2();
		Tv2 tv2= new Tv2("Red", true, 7);
		
		tv2 = tv;		// 원래힙에 tv2를 가르키던 메모리가 있었는데 끊기고 tv를 가르킨다. 자동으로 가비지 컬렉터가 가져감

		System.out.println("현재 채널은 "+tv2.Channel);
		System.out.println("현재 색상은 "+tv2.Color);
		System.out.println("현재 전원 상태는 "+tv2.Power);
		
	}

}

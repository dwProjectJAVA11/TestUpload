package CLS;

public class TvEx3 {

	public static void main(String[] args) {

		Tv tvArr[] = new Tv[5];
		
		// 객체 생성 후 배열에 담기
		for(int i = 0; i<tvArr.length; i++)
		{	
			tvArr[i] = new Tv();
			tvArr[i].Channel = i+10;
		}	
		
		for(int i = 0; i<tvArr.length; i++)
		{	
			tvArr[i].ChannelUp();
			System.out.println((i+1) + "번째 채널 : " + tvArr[i].Channel);
		}

	}

}

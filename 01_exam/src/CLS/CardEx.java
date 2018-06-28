package CLS;

public class CardEx {

	public static void main(String[] args) {

		System.out.println("Card Width : " + Card.width);
		System.out.println("Card Height : " + Card.height);

		Card cd = new Card();
		cd.kind = "Heart";
		cd.number = 7;
		
		Card cd2 = new Card();
		cd2.kind = "Spade";
		cd2.number = 4;
		
		System.out.println("card1 : " + cd.kind + " / " + cd.number + ", Card width " + cd.width + " / Card height " + cd.height);
		
		cd.height = 10;
		cd2.width = 50;
		
		System.out.println("card2 : " + cd2.kind + " / " + cd2.number+ ", Card width " + cd2.width + " / Card height " + cd2.height);
		
		// 공유하기 때문에 다른 객체에서 값을 바꾸어도 다같이 바뀜
		
		
		
	}

}

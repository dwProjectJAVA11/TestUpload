package CLS;

public class Tv2 {

	String Color;
	boolean Power;
	int Channel;	
	
	// 초기화 방식 1. 직접지정(사용X)	 2. 생성자 이용 	3. Setter 이용하기

	// 생성자 (객체변수 초기화) -> 1. 클래스명과 동일하게 작성	2. 여러 개 작성가능(인자의 수, 매개변수의 타입은 다르게)=>오버로딩	3. 디폴트생성자는 생성자가 하나도 없다면 컴파일러가 자동으로 만들어 준다.
	// 생성자는 리턴타입이없다.
	Tv2(){ }	// Default 생성자	 
	
	Tv2(String Color, boolean Power, int Channel)	// 인자를 받는 생성자
	{
		this.Color = Color;
		this.Power = Power;
		this.Channel = Channel;
		
	}
	
	Tv2(String Color, boolean Power)	// 인자를 받는 생성자 -> 여러 형태로 존재
	{
		this.Color = Color;
		this.Power = Power;
	}
	
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

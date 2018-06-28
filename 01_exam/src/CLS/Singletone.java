package CLS;

public class Singletone {
	
	// 객체를 공유하게 만든다.
	private static Singletone st = new Singletone();	// 항상 클래스밖 main에서 했던 new를 클래스안에서!
	
	static Singletone getInstance()		// 메소드
	{
		return st;
	}
	
	// new를 할 수 없도록 어떻게 해야할까? -> default 생성자 호출을 막자!
	private Singletone()		// public을 private로 바꾼다.
	{
		
	}
	
}

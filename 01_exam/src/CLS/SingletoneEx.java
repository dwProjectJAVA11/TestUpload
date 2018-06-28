package CLS;

public class SingletoneEx {

	public static void main(String[] args) {

		// Singletone newst = new Singletone();
		// Singletone dirst = Singletone.st;	// static이기때문에 직접접근은 가능하다! -> 그러면 또 new인데... -> 또 private로 막자
		
		Singletone st = Singletone.getInstance();
		Singletone st2 = Singletone.getInstance();
		
		if(st == st2) 		// -> 주소가 같은가?		두 객체 모두 하나의 주소를 가르키고 있다!
			System.out.println("같은 객체");
		else	System.out.println("다른 객체");
	}

}

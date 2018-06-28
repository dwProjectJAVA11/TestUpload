package CLS;

public class Math {
	
	/*
	 static -> 각 객체마다 있던 인스턴스 변수가 static을 붙이면 static끼리 필드에 존재하게 된다. 또한 공유하게 되어 값이 바뀌면 다음에 static 변수를 사용하게 되면 바뀐 값을 사용하게 된다.
	 인스턴스는 생성하지 않으면 메모리를 잡을 수 없고 가질 수 없지만 static은 먼저 올라간다.(인스턴스명.변수 vs 클래스명.변수) 상수형태로 final과 함께 올라감 
	 1. 멤버변수 중 모든 인스턴스가 공통으로 사용하는 것에 붙인다.
	 2. 인스턴스를 생성하지 않아도 쓸 수 있다.		클래스명 객체명 = ~ 하는 것이 아니라 클래스명.static변수이름 으로 사용하기 때문이다.
	 3. 인스턴스 변수/인스턴스 메소드 사용 불가
	 4. 대부분 정적필드 선언과 동시에 초기화 
	  */
	long a, b;
	static long c, d;		// 클래스 변수
	
	long add() {
		return a + b;
	}

	long subtract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}


	static long add(long c, long d) {		// 클래스 메소드
		// return a+b; -> X
		return c + d;
	}

	static long subtract2() {		// static메소드 안에서는 static으로 선언된 변수만 접근 가능
		return c - d;
	}

	static long multiply(long c, long d) {
		return c * d;
	}

	static long divide(long c, long d) {
		return c / d;
	}
}
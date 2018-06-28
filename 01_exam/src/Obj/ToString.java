package Obj;

import java.util.Calendar;
import java.util.Date;

public class ToString {

	public static void main(String[] args) {
		
		Value v = new Value(15);
		System.out.println(v.toString());
		// 기본적으로 오브젝트 클래스의 toString은
		// 16진수로 해시코드리턴
		// 패키지명.클래스명.해시코드
		
		// -> Value클래스에 오버라이딩 해준다.
		// toString() : 인스턴스 변수에 저장된 값들을 리턴하는 형태로 오버라이딩
	
		System.out.println(new Member("Jeon").toString());
		
		
		// API에서 제공하는 클래스들의 toString()
		// toString이 오버라이딩 되어있다면 굳이 toString을 쓰고 객체명만 써도 자동으로 String화 되어 나온다.
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		
		Person p = new Person("Daseul123","Kim");
		System.out.println(p);		
		
		// Calendar cal = new Calendar();	// 추상클래스이므로 new 불가
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// toString은 객체에서만 쓸 수 있다.
		Integer i = 32;
		int i2 = 32;
		i.toString();
		// i2.toString(); -> 객체가 아니라서 안 됨!
		// Integer, Float, Double,... 앞글자가 대문자이면 랩퍼
		// 객체로 만들어서 메소드를 이용하겠다.
		
	}

}

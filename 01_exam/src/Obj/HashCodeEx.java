package Obj;

public class HashCodeEx {

	public static void main(String[] args) {

		Object o1 = new Obj();
		Object o2 = new Obj();
		
		
		// 오브젝트의 hashCode()는 그 값이 저장된 위치를 알려준다
		// => 주소값을 이용해서 해시코드를 만들어 변환
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		String s1 = new String("12345");
		String s2 = new String("12345");
		
		// 스트링 클래스의 hashCode()는 오버라이딩이 되어있다.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		// 원래 해시코드는 다르지만 .hashCode만 오버라이딩이 되어있다.
		
	}

}

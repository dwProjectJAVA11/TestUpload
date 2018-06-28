package Reference;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;		// 참조변수 초기화
		//str = "안녕하세요.";		// 참조변수 값 할당
		str = new String("홍길동");
		
		String str2 = str = new String("홍길동");

		// 참조타입의 경우 힙 주소값을 비교하게됨
		System.out.println(str == str2);
		// 문자열의 값을 비교하고 싶다면 equals사용
		System.out.println(str.equals(str2));
		

		String str3 = "송중기";		// 참조변수 초기화
		String str4 = "송중기";		// 참조변수 초기화
		// 자바에서는 문자열 리터럴이 동일할 경우
		// String객체를 공유ㅏ도록 되어 있기 때문에
		// NEW를 쓰지않으면 동일한 객체를 참조한다는 의미로 TRUE가 나오게됨

		// -> 리터럴 자체를 비교한 것이 아니라 스택에 있는 주소값이 동일
		System.out.println(str3 == str4);
		
		
		
	
	}
}
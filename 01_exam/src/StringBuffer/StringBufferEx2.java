package StringBuffer;

public class StringBufferEx2 {
	public static void main(String[] args) {
		
		// 아래와 똑같은 작업을 빌더에서도 할 수 있다.
		// 차이점은 버퍼는 스레드허용, 빌더는 스레드X
		// 스레드환경이 맞다면 버퍼, 아니라면 빌더 사용
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Java");
		sb1.append("Programming");
		System.out.println(sb1.toString());
		
		sb1.insert(4, "Test");
		System.out.println(sb1.toString());
		
		sb1.replace(6, 10, "Book");
		System.out.println(sb1.toString());
		
		System.out.println("총 문자 수 : " + sb1.length());
		
		System.out.println(sb1.reverse());
	}
}

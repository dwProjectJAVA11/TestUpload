package Reference;

public class ArrayTest1 {

	public static void main(String[] args) {

		// int a;
		// System.out.println(a);
		
		// 위 a 같은 경우에는 초기화하지 않아서 컴파일 에러이지만	
		// 참조타입은 초기화 하지 않아도 기본값이 할당된다.
		
		// 배열 선언
		int[] score;
		String name[];
		
		// 배열 할당
		score = new int[5];
		name = new String[5];
		
		// 배열 초기화
		score[0] = 95;
		
		System.out.println(score[0]);

		System.out.println(name[0]);
		
		
	}

}

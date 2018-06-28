package Modifier;

public class TestEx {

	public static void main(String[] args) {

		// 객체생성
		Test obj = new Test(10, "홍길동");
		// 생성자가 private
		// 객체 초기화
		// 1. 직접접근	2.생성자	3.setter 메소드(변경시에도 사용)
		
		 obj.setA(20);
		 obj.setStr("김다슬");
		 
		 System.out.println(obj.getA());

		
	}

}

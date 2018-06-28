package poly;

public class ChildEx {

	public static void main(String[] args) {

		// 자동 형변환이 되었다면
		// 부모클래스에 있는 필드와 메소드만 접근이 가능하다.
		// 단, 오버라이딩 된 메소드가 있다면 자식클래스의 메소드가 대신 호출된다.
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();
		
		// parent.method3(); -> 자식클래스에서 추가한 메소드이므로 형변환된 상탱서는 접근 불가	3는 못불러용

		
		// 새롭게 추가되는 메소드를 접근하기 위해서는 다시 ㅣ자식타입으로 캐스팅 필요
		Child c = (Child)parent;
		c.method3();
	}
	
	
}

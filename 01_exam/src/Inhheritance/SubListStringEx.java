package Inhheritance;

public class SubListStringEx {

	public static void main(String[] args) {

		SubListString obj = new SubListString();
		obj.list();
		// 오버라이딩학 되면 부모의 메소든ㄴ 가려진다. -> 자식클래스의 super.메소드를 호출하여 부모의 메소드를 호출할 수 있다.
		
		ListString obj1 = new ListString();
		obj1.list();

		//다 형성
		ListString obj3 = new SubListString();
		obj3.list();
		// 왼쪽과 오른쪽이 다르게 new하는 것은 상속관계일경우에만 가능
		
	}
}

package poly;

public class PromotionEx {

	public static void main(String[] args) {
		
		// 상속관계에서 자동 형변환
		Animal animal1 = new Feline();		// super가 숨어있다! 그래서 부모의 생성자도 호출된다.
		Animal animal2 = new Canine();
		Animal animal3 = new Dog();
		Animal animal4 = new Lion();
		
		Feline feline1 = new Lion();
		Canine canine1 = new Dog();
	
		// Lion lion = (Lion)new Dog();		// -> Lion과 Dog는 아무 관계없으며 강제형변환도 되지않는다.
	}

}

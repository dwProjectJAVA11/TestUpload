package Inhheritance;

public class BTest {

	public static void main(String[] args) {

		B obj = new B();
		obj.print();
		obj.sum();
		obj.average();
		
		A obj2 = new B();
		obj2.print();
		obj2.sum();

	}

}

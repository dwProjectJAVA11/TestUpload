package Wrapper;

public class EqualsTest {

	public static void main(String[] args)
	{
		Integer obj1 = new Integer(256);
		Integer obj2 = new Integer(256);
		
		System.out.println(obj1 == obj2?"같다":"다르다");
		System.out.println(obj1.equals(obj2)?"같다":"다르다");
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.println(obj3 == obj4?"같다":"다르다");
		System.out.println(obj4.equals(obj4)?"같다":"다르다");
		
	}
}

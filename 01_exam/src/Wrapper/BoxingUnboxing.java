package Wrapper;

public class BoxingUnboxing {

	public static void main()
	{
		// Boxing -> 객체로 생성한다.
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = 300;
		Integer obj4 = Integer.valueOf("300");
		
		// Unboxing
		int val1 = obj1;
		int val2 = obj2;
		int val3 = obj3;
		int val4 = obj4;
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		
	}
	
}

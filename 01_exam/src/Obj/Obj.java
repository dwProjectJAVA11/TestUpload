package Obj;

public class Obj {

	public static void main(String[] args) {
		//
		Object o1 = new Obj();
		Object o2 = new Obj();

		// 오브젝트가 가지ㄷ고 있는 equals 메소드는 주소비교이다.
		if (o1.equals(o2)) 
		{
			System.out.println("같다");
		} 
		
		else 
		{
			System.out.println("다르다");
		}

		if (o1 == o2) 
		{
			System.out.println("같다");
		} 
		
		else
		{
			System.out.println("다르다");
		}

		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

	}
}

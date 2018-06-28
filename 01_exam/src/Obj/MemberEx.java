package Obj;

public class MemberEx {

	public static void main(String[] args) {

		Member m1 = new Member("12345");
		Member m2 = new Member("12345");
		
		if(m1.equals(m2))
		{
			System.out.println("같다");
		}
		else { System.out.println("다르다");}
		
	}
}

package loop;

public class IFTest7 {

	public static void main(String[] args) {

		int x = (int)Math.random()*100 +4;		
		System.out.println("x는  : " + x);
			
		String result = ((x%2 == 0)?"x는 홀수":"x는 짝수");
		System.out.println(result);
	}

}

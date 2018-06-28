package Except;

public class math {
	public static void main(String[] args) throws ArithmeticException {

		int num1 = 3, num2 = 0;
		System.out.println(num1/num2);
		
		try
		{
			print();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	// 에러를 던지는 것은 나를 호출한 곳으로 -> 메인으로 던지면 JVM이 처리해줌
	static void print() throws ClassNotFoundException
	{
		Class.forName("");
	}
}
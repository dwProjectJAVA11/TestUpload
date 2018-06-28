package Except;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0 ; i<10;i++)
		{
			try {
			result = number/(int)(Math.random()*10);
			System.out.println(result);
			}
			catch(ArithmeticException e)
			{
				// 예외상황이 발생하면 해야할 일
				System.out.println("catch");
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
			finally
			{
				// 예외 발생 여부와 상관없이 무조건 수행
				
			}
		}
	}

}

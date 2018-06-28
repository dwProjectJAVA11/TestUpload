package Except;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		try {
			method1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception
	{
		// 예외가 나지 않는 상황에서 일부러 예외를 발생시킬 수 있다.
		throw new Exception();
		
	}
	
	static void method2()
	{
		// 런타임은 실행해봐야 아는 것이기 때에 빨간 줄이 없당. 
		throw new RuntimeException();
	}

}

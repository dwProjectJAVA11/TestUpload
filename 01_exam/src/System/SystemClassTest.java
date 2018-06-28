package System;

public class SystemClassTest {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++)
		{
			System.out.println(i);
			if(i==5)	System.exit(0);
			// 프로그램의 정상종료 (JVM off)
			//0이 아닌 값을 넣으면 비정상 종료
		}
	}

}

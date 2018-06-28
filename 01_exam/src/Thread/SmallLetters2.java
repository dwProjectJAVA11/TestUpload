package Thread;

public class SmallLetters2 implements Runnable{
	
	// 멀티쓰레드 만들기
	// 1. Thread 상속
	// 2. Runnable 구현
	
	@Override
	public void run()
	{
		// run안에 스레드로 돌릴 내용을 구현한다.
		for(int i=0;i<26;i++)
			System.out.println((char)(i+97));
	}

}

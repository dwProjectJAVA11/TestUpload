package Thread;

public class BigLetters {

	public static void main(String[] args)
	{
		Thread t1 = new SmallLetters();
		t1.start();
		// start하면 바로 실행하는 게 아니라 스케줄러가 실행 대기한다.
		
		for(int i=0;i<26;i++)
			System.out.println((char)(i+65));
	}

}

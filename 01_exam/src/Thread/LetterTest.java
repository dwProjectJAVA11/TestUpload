package Thread;

public class LetterTest {

	public static void main(String[] args)
	{
		Thread t1 = new SmallLetters();
		System.out.println("t1 : "+t1.getName());
		t1.start();
		
		Thread t2 = new NumPrint();
		System.out.println("t2 : "+t2.getName());
		t2.start();

		// main 스레드 이름 알아내기
		Thread mainT = Thread.currentThread();
		System.out.println("mainT : "+mainT.getName());
		
		for(char ch = 'a';ch<='z';ch++)
			System.out.print(ch+" ");
		
		
	}

}

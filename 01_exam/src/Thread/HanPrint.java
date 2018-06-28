package Thread;

public class HanPrint extends Thread{

	@Override
	public void run()
	{
		char chArr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ',
						'ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ',};
		
		for(char c : chArr)
			System.out.print(c+" ");
		super.run();
	}

	
}

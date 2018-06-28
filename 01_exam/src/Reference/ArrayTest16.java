package Reference;

import java.util.Scanner;

public class ArrayTest16 {

	public static void main(String[] args) {

		// 원래 단어 알아 맞추기
		String[] words = {"Television","Coumputer","Mouse","Phone"};
		int randNum = 0;
		
		char temp = ' ';
		
		Scanner sc = new Scanner(System.in);
		// sc.nextLine();
		
		for(int i = 0; i< words.length; i++)
		{
			// words 배열의 값을 읽어와서 char 배열로 변경
			char[] question = words[i].toCharArray();		// toCharArray()
			
			// question에 들어와 있는 값의 자리를 서로 바꾸기
			
			for(int j = 0 ;j< question.length; j++)
			{
				randNum = (int)(Math.random()*(question.length));
				
				temp = question[j];
				question[j] = question[randNum];
				question[randNum] = temp;
			}
			
			System.out.printf("%d. %s의 정답을 입력해주세요 : ",i+1, new String(question));
			String answer = sc.nextLine();

			// 사용자가 입력한 단어와 원래의 단어가 맞는 지 확인 후 결과 값 출력
			if(words[i].equals(answer))
			{
				System.out.println("Correct!");
			}
			else 
				System.out.println("wrong");
		}

	}

}

package loop;

import java.util.Scanner;

public class DoWhileTest1 {

	public static void main(String[] args) {
		
		int input = 0, answer = 0;
		Scanner sc = new Scanner(System.in);
		
		answer = (int)(Math.random()*100)+1;
		
		do {
			System.out.println("1~100사이의 정수입니다.");
			input = sc.nextInt();
			
			if(answer<input)
				System.out.println("더 작은 수 입력");

			else if(answer>input)
				System.out.println("더 큰 수 입력");
			else	break;
				
				
		}while(input!=answer);
		
		System.out.println("정답!");
		sc.close();
	}

}

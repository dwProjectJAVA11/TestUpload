package loop;
import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {

		// q가 입력되기 전까지 계속 문자 입력 받고 출력

		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.println("메시지를 입력하고 종료를 원하시면 q를 눌러주세요.");
		
		do {
			System.out.println(">>");
			input = sc.nextLine();
			
			System.out.println(input);
			
		}while(!input.equals("q"));		// String은 ==이 아닌 equals 사용

		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}

}

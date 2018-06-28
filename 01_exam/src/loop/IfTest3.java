package loop;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닌 " + num + "입니다.");
		}
	}
}

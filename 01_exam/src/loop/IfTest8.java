package loop;

import java.util.Scanner;

public class IfTest8 {

	public static void main(String[] args) {
		
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("x는  : ");
		sc.nextInt(x);
		
		if(x % 2 == 0) {
			System.out.println("x는 짝수입니다.");
		}
		else {
			System.out.println("x는 홀수입니다.");
		}
	}

}

package loop;

import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("커피를 살 액수를 입력하세요 : ");
		x = sc.nextInt();
		
		int CountCoffe = (int)(x/200);
		System.out.println("구입할 수 있는 커피의 잔수는 "+CountCoffe+"잔 입니다.");

	}

}

package exam;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("-> " + num);

		sc.close();
	}

}

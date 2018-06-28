package Inhheritance;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("첫번째 문자열 입력");
		String str1 = sc.nextLine();
		
		System.out.println("두번째 문자열 입력");
		String str2 = sc.nextLine();
		
	}
}

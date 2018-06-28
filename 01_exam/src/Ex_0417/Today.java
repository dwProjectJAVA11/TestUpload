package Ex_0417;

import java.util.Scanner;

public class Today {

	public static void main(String[] args) {
		System.out.println("한 달 월급은?");
		Scanner sc = new Scanner(System.in);	// 어디에서 읽어들이는 지 , 지금은 키보드
		int num = sc.nextInt();
		System.out.println("10년동안 저축한다면? -> " + num*12*10);
		sc.close();
		
	}

}

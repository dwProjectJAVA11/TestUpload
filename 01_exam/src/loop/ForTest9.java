package loop;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {

		int num1 =0, num2=0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 부호 입력");
		String c = sc.next();

		System.out.println("숫자1 : ");
		num1 = sc.nextInt();
		
		System.out.println("숫자2 : ");
		num2 = sc.nextInt();
	
		switch(c) {
		case "+" : result = num1+num2;	break;
		case "-" : result = num1-num2;	break;
		case "/" : result = num1/num2;	break;
		case "*" : result = num1*num2;	break;
		case "%" : result = num1%num2;	break;
		default : System.out.println("잘못된 부호입니다.");
		}
		
		System.out.println(num1+c+num2+" = "+result);
		
		sc.close();

	}

}

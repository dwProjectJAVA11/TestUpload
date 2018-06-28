package loop;

import java.util.Scanner;

public class ForTest8 {

	public static void main(String[] args) {

		int min = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요");
		int num2 = sc.nextInt();
		
		System.out.println("세번째 정수를 입력하세요");
		int num3 = sc.nextInt();
		
		if(num1 <= num2)
		{
			min = num1;
			if(min >= num3) {
				min = num3;
			}
		}
		else if(num1 >=num2)
		{
			min = num2;
			if(min >= num3) {
				min = num3;
			}
		}

		System.out.println("세 수 중 가장 작은 수는 "+min);
			
		max = num1;
		if(max <= num2) {
			max =num2;
		}
		if(max <= num3) {
			max =num3;
		}
		
		System.out.println("세 수 중 가장 큰 수는 "+max);
		
		sc.close();
	}

}

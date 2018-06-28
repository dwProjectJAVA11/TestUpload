package loop;

import java.util.Scanner;

public class IfTest6 {
	public static void main(String[] args) {

		int pay = 5000;
		int hour = 0;
		int addhour = 0;
		
		System.out.print("근무시간을 입력하십시오 : ");
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		
		if(hour>8) {
			addhour = hour - 8;
		}
		
		System.out.printf("오늘의 수당은 %d원입니다.",(int)(hour*pay + addhour*pay*1.5));
		
	}

}

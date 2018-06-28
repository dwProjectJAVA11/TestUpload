package loop;
import java.util.Scanner;

public class IfTest10 {

	public static void main(String[] args) {
		
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Year : ");
		year = sc.nextInt();
		
		if(((year % 4 == 0) && (year%100!=0)) || (year % 400 == 0))
		{
			System.out.println(year + "년은 윤년입니다.");
		}
		
		else
		{
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
	}
}
package Reference;

import java.util.Scanner;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int StudentNum = 0;
		int[] scores = null;
		int selectNum = 0;
		int max = 0;

		while(run) {
			System.out.println("----------");
			System.out.println("1. 학생수 2.점수입력 3.점수리스트 4.분석 5. 종료");
			System.out.println("----------");
			System.out.println("선택 > ");
		
			selectNum = sc.nextInt();
			
			if(selectNum == 1)
			{	
				System.out.println("학생수 > ");
				StudentNum = sc.nextInt();
				scores = new int[StudentNum];
			
			}
			
			else if(selectNum == 2)
			{	
				System.out.println("점수입력 > ");
				
				for(int i=0;i<scores.length;i++) {
					System.out.print("socres["+i+"] :");
					scores[i] = sc.nextInt();
				}
			
			}
			
			else if(selectNum == 3)
			{
				for(int score : scores){
				//for(int i=0;i<scores.length;i++) {							
					// for(타입 score: 배열명ㅇ)
					// 향상된 for문 -> 대괄호나 i 가 필요없다.
				
				
					System.out.println("socres["+score+"] :"+score);
				}
			}

			else if(selectNum == 4)
			{
				for(int i= 0; i< scores.length ; i++)
				{
					if( i == 0 ) {	max = scores[i];}
					else if(max < scores[i]) {	max = scores[i]; }
				}
				System.out.println("최고점수 : "+max);
				System.out.println("평균점수 : "+(max/scores.length));
			}

			else if(selectNum == 5)		run = false;
		}
		
		
	
		
	}

}

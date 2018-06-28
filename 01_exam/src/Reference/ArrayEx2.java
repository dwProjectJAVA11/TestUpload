package Reference;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[8];		
		int sum = 0;
		int max = 0;

		for(int i= 0; i< score.length;i++)
		{
			System.out.print("Score > ");
			score[i] = sc.nextInt();
			sum += score[i];
			
			if(i == 0)	max = score[i];
			else {
				if(score[i] > max) max = score[i];
			}
		}

		System.out.println("최고점수 : " + max + "평균점수 : " + (sum/score.length));
	}

}

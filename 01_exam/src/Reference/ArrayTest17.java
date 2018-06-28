package Reference;

public class ArrayTest17 {

	public static void main(String[] args) {

		int score[][] = {
			{100,100,100},
			{20,20,20},
			{30,40,30},
			{40,50,20},
			{50,60,50}
		};
		
		int result[][] = new int[score.length+1][score[0].length+1];
		// 스코어는 총 5개이고 배열은 0번 부터 시작하지만 길이는 총 갯수이므로 1부터 시작한다.
		
		// 스코어배열의 값을 리절트 배열로 옮긴 후 합계를 계산하여 담는다.

		for(int i = 0; i<score.length ; i++)
		{
			for(int j = 0; j< score[i].length; j++)
			{
				result[i][j] = score[i][j];
				
				result[i][score[i].length]+= score[i][j];
				result[score.length][j]+=score[i][j];
				result[score.length][score[i].length] += score[i][j];
			}
		
		}
		
		
		// result 배열 출력
		for(int i = 0; i<result.length ; i++)
		{
			for(int j = 0; j< result[i].length; j++)
			{
				
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}

	}

}

package Reference;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[] = new int[] {0,10,20,30,40};
		int score2[] = {40,30,20,10,0};
		// 둘 다 OK!
		
		int sum = 0;
		int avg = 0;
		for(int i=0;i<score.length;i++) {
			// score[i] = i*10;
			sum+=score[i];
			System.out.println(score[i]);
		}
		avg = sum/score.length;
		
	}

}

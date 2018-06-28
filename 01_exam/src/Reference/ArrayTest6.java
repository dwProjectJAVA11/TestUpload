package Reference;

public class ArrayTest6 {
	public static void main(String[] args) {
	
		// 2차원 배열
		
		int scores[][] = new int[2][3];
		
		scores[0][0] = 15;
		scores[0][1] = 20;
		scores[0][2] = 30;
		
		scores[1][0] = 80;
		scores[1][1] = 40;
		scores[1][2] = 10;
		
		
		
		
		for(int i = 0; i< scores.length ; i++)
		{
			for(int j = 0;j<scores[i].length;j++) 
				System.out.println(scores[i][j]+" ");
			System.out.println();
		}
		
	}
}

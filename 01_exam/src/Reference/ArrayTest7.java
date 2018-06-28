package Reference;

public class ArrayTest7 {

	public static void main(String[] args) {

		int scores[][] = {{15,25},{45,55,55}};
	
		for(int i = 0; i< scores.length ; i++)
		{
			for(int j = 0;j<scores[i].length;j++) 
				System.out.println(scores[i][j]+" ");
			
			for(int score[] : scores) {
				
			}
			
			System.out.println();
			
			
		}

	}

}

package Reference;

public class ArrayTest8 {

	public static void main(String[] args) {

		int score[] = {79,8,91,33,100,55,95};
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i< score.length ; i++)
		{
			if ( i == 0 )
			{	
				max = score[i];	min = score[0];
			}
			
			if(max < score[i])	max = score[i];
			if (min > score[i])	min = score[i];
			
		}
		
		System.out.println("Max is "+max+" Min is "+min);
	}

}

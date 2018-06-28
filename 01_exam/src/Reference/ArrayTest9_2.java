package Reference;

public class ArrayTest9_2 {

	public static void main(String[] args) {


		int card[] = new int[45];
		
		int temp = 0, MixNumber = 0;
		
		for(int i = 0; i < card.length ; i++)
		{
			card[i] = i+1;
			System.out.print(card[i]+" ");
		}
	
		System.out.println();
		
		for(int i = 0; i < card.length ; i++)
		{
			MixNumber =(int)(Math.random()*10);
		
			temp = card[i];
			card[i] = card[MixNumber];
			card[MixNumber] = temp;
		}
		
		for(int i = 0; i < card.length ; i++)
		{
			System.out.print(card[i]+" ");
	
		}
	}

}
package loop;

public class ForTest6 {

	public static void main(String[] args) {

		for(int k = 0; k< 9;k+=3) {
			for(int i =1;i<=9;i++)
			{
				for(int j = 2; j <=9 ; j++)
				{
				System.out.printf("%dX%d = %d ", j,i,i*j);
				}
				System.out.println("");
			}
		
		}
		
		
		
	}

}

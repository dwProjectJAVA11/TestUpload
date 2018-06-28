package loop;

public class MakeStar {
	public static void main(String[] args) {
		
		int n=1;
		
		for(int i =0; i<9; i++)
		{
			for(int j = 1 ; j<=n+(5-n)*2+1; j++)
			{
				System.out.print(j<=n? " ":"*");
			}
			
			System.out.println();
			if(i<4)
				n++;
			else n--;
		}	
			
//	for(int i =0;i<=3;i++) {
//		for(int j =0;j<=3;j++) {
//			for(int k =0;k<=3;k++) {
//				System.out.println(""+i+j+k);
//			}
//		}
//	}
		
	
	}
}



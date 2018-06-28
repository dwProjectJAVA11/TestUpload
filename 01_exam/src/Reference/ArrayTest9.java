package Reference;

public class ArrayTest9 {

	public static void main(String[] args) {

		int numArr[] = new int [10];
		int n = 0;
		int tmp = 0;
		for(int i = 0; i< numArr.length ; i++)
		{
			numArr[i] = i;
			System.out.print(numArr[i]);
		}

		System.out.println();
		
		// 값 섞기
		for(int i = 0; i< numArr.length ; i++)
		{
			n = (int)(Math.random()*10);			// 0~9까지
			
			System.out.print(n);
			tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println();
		
		for(int i = 0; i< numArr.length ; i++)
		{
			System.out.print(numArr[i]);
		}
	}

}

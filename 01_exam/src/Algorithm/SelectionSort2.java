package Algorithm;

public class SelectionSort2 {
	public static void main(String[] args)
	{
		int arr[] = { 27, 6, 55, 38, 69, 2, 48, 67, 11 };

		int temp = 0;
		int maxIndex = 0;
		
		for (int j = 0; j < arr.length; j++)
		{
			for (int i = maxIndex; i < arr.length; i++)
			{
				if (arr[maxIndex] < arr[i])
				{
					maxIndex = i;
				}
			}
			
			temp = arr[j];
			arr[j] = arr[maxIndex];
			arr[maxIndex] = temp;

			maxIndex = j+1;
		}

		for (int loop : arr)
			System.out.println(loop);
	}
}

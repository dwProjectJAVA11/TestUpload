package Algorithm;

public class SelectionSort {
	public static void main(String[] args)
	{
		int arr[] = { 27, 6, 55, 38, 69, 2, 48, 67, 11 };

		int temp = 0;
		int minIndex = 0;
		
		for (int j = 0; j < arr.length; j++)
		{
			for (int i = minIndex; i < arr.length; i++)
			{
				if (arr[minIndex] > arr[i])
				{
					minIndex = i;
				}
			}
			
			temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;

			minIndex = j+1;
		}

		for (int loop : arr)
			System.out.println(loop);
	}
}

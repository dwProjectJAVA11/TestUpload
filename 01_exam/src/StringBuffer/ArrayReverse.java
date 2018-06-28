package StringBuffer;

public class ArrayReverse {

	public static void main(String[] args)
	{
		int arr[] = { 22, 57, 11, 32, 91, 68, 70 };
		
		for(int i = 0; i<(arr.length/2);i++)
		{
			int temp = arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i];
			arr[i] = temp;
			//sysout
			
		}
		
		for(int i = 0;i<arr.length ;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

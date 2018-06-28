package Array;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args)
	{
		int arr[] = { 11, 13, 25, 27, 36, 45, 65 };
		
		int pos = Arrays.binarySearch(arr, 36);
		System.out.println("위치 : "+(pos+1));
	}

}

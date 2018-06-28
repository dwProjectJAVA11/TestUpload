package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args)
	{
		int arr1[] = {10,73,2,-5,42};
		int arr2[] = {10,73,2,-5,41};
		
		// 배열요소 출력
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.equals(arr1,arr2)?"같음":"다름");
	}

}

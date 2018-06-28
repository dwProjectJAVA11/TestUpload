package Array;

import java.util.Arrays;

public class ArrayBinarySearch2 {

	public static void main(String[] args)
	{
		String arr[] = {"abstract","assert","boolean","break","byte","case","catch","class","const","continue","default",
					"do","double","else","enum","extends","final","finally","float","instanceof","int","interface","long","native","new","package","private",
					"protected","public","return","shotr","static","strictfp","super","switch","synchronized","this","throw","throws","transient",
					"try","void","volatile","while"};
		
		int index = Arrays.binarySearch(arr, "private");
		if(index >= 0)
			System.out.printf("%d번 째 위치에 있음", index+1);
		else
			System.out.println("값이 없음");
		
	}

}

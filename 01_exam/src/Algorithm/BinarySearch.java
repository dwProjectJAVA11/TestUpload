//package Algorithm;
//
//public class BinarySearch {
//
//	public static void main(String[] args)
//	{
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//		binarySearch(arr, 10);
//
//	}
//
//	static int binarySearch(int[] arr, int find)
//	{
//		boolean check = true;
//		int num = arr.length / 2;
//		while (true)
//		{
//			if (arr[num] != find)
//			{
//				if (arr[num] > find)
//				{
//					num = num / 2;
//				}
//
//				else if (arr[num] < find)
//				{
//					num += num / 2;
//				}
//			}
//			else
//			{
//				System.out.println("해당 숫자는" + num + "번째 입니다.");
//				return num;
//			}
//			
//
//		}
//		return find;
//
//	}
//
//}

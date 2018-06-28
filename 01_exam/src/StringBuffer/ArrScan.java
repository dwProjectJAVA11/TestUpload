package StringBuffer;

import java.util.Scanner;

public class ArrScan {

	public static void main(String[] args)
	{
		int[] Arr1 = new int[100];
		int[] Arr2 = new int[100];

		int nextInt = 0;
		int ArrNum = 0;
		Scanner sc = new Scanner(System.in);

		boolean whileCheck = true;
		for (int i = 0; i < 2; i++)
		{
			while (whileCheck)
			{
				System.out.print("Arr" + (i + 1) + "의 숫자를 입력하세요 (-1은 입력종료): ");
				nextInt = sc.nextInt();
				if (nextInt == -1)
					break;
				else
				{
					if (i == 0)
					{
						Arr1[ArrNum] = nextInt;
						ArrNum++;
					}

					if (i == 1)
					{
						Arr2[ArrNum] = nextInt;
						ArrNum++;
					}
				}
			}
			ArrNum = 0;
		}

		// 배열의 길이가 다른경우
		compareToLength(Arr1, Arr2);

		// 배열안의 요소가 다른경우
		compareToArr(Arr1, Arr2);

	}

	public static void compareToLength(int[] a, int[] b)
	{
		if (a.length != b.length)
		{
			System.out.println("배열의 길이가 다릅니다. -> 두 배열이 다릅니다.");
		}
	}

	public static void compareToArr(int[] a, int[] b)
	{
		for (int j = 0; j < a.length; j++)
		{
			for (int i = 0; i < a.length; i++)
			{
				if ((a[j] == b[i]))
				{
					break;
				}

			}
			
		}
	}

}

package Algorithm;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();

		System.out.print("b : ");
		int b = sc.nextInt();

		System.out.print("c : ");
		int c = sc.nextInt();

		// 1.
		if (a > b)
		{
			if (b > c)	System.out.println("중간값은 b : " + b);
			if (b < c)
			{
				if (a > c)
					System.out.println("중간값은 c : " + c);
				if (a <= c)
					System.out.println("중간값은 a : " + a);
			}
			if (b == c)	System.out.println("중간값은  b : " + b);
		}

		if (a < b)
		{
			if (a > c)	System.out.println("중간값은 a : " + a);
			
			if (a < c)
			{
				if (b > c)
					System.out.println("중간값은 c : " + c);
				if (b <= c)
					System.out.println("중간값은  b : " + b);
			}
			
			if (a == c)	System.out.println("중간값은 a : " + a);
		}

		if (a == b)	System.out.println("중간값은 a : " + a);
	
	}

}

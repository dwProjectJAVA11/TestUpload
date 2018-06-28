package System;

public class SystemClassTest2 {

	public static void main(String[] args)
	{
		long time1 = System.currentTimeMillis();
		long sum = 0;

		for (int i = 0; i <= 1000000; i++)
			sum += i;
		
		long time2 = System.currentTimeMillis();
		System.out.println("1~10,000,000 의 합 : " + sum);
		System.out.println("1~10,000,000 의 합산 시 걸리는 시간: " + (time2 - time1));

	}

}

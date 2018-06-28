package Except;

public class ExceptionTest1 {

	static int getTotal(int arr[])
	{
		int total = 0;
		for(int num : arr)
			total += num;
		return total;
	}

	static double getAverage(int arr[]) throws Exception
	{
		if(arr.length == 0 )
			throw new Exception("비어 있는 배열입니다.");
		return getTotal(arr)/arr.length;
	}
	
		
	public static void main(String[] args) {
		
		int arr[] = new int[0];
		System.out.println("총합 : "+ getTotal(arr));
		try {
			System.out.println("평균 : "+ getAverage(arr));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
